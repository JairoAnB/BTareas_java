package org.horoscopo.final_drilling_modulo_5.controller;


import jakarta.servlet.http.HttpSession;
import org.horoscopo.final_drilling_modulo_5.dto.HoroscopoDtoCreate;
import org.horoscopo.final_drilling_modulo_5.dto.UsuarioDtoCreate;
import org.horoscopo.final_drilling_modulo_5.mapper.UsuarioMapper;
import org.horoscopo.final_drilling_modulo_5.model.Horoscopo;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.horoscopo.final_drilling_modulo_5.repository.HoroscopoRepository;
import org.horoscopo.final_drilling_modulo_5.repository.UsuarioRepository;
import org.horoscopo.final_drilling_modulo_5.service.HoroscopoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Controller
@RequestMapping("/registro")
public class RegisterController {

    private final UsuarioRepository usuarioRepository;
    private final HoroscopoRepository horoscopoRepository;
    private final HoroscopoService horoscopoService;
    private final HttpSession httpSession;


    @Autowired
    public RegisterController(UsuarioRepository usuarioRepository, HoroscopoRepository horoscopoRepository, HoroscopoService horoscopoService, HttpSession httpSession) {
        this.usuarioRepository = usuarioRepository;
        this.horoscopoRepository = horoscopoRepository;
        this.horoscopoService = horoscopoService;
        this.httpSession = httpSession;
    }

    @GetMapping
    public String registro(Model model) {
        return "registro";
    }

    @PostMapping("/registerUsuario")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String contrasena, @RequestParam LocalDate fechaNacimiento, Model model) {
        Optional<Usuario> optional = usuarioRepository.findByEmail(email);
        if (optional.isPresent()) {

            model.addAttribute("usuarioEncontrado", true);
            return "registro";
        }

        String signo = horoscopoService.obtenerSigno(fechaNacimiento);

        UsuarioDtoCreate nuevoUsuarioDto = new UsuarioDtoCreate();
        nuevoUsuarioDto.setNombre(nombre);
        nuevoUsuarioDto.setEmail(email);
        nuevoUsuarioDto.setPassword(contrasena);
        nuevoUsuarioDto.setFechaNacimiento(fechaNacimiento);
        nuevoUsuarioDto.setAnimalHoroscopo(signo);

        Usuario nuevoUsuario = UsuarioMapper.toEntity(nuevoUsuarioDto);

        usuarioRepository.save(nuevoUsuario);

        model.addAttribute("usuarioCreado", true);

        httpSession.setAttribute("LoginUsuarioID", nuevoUsuario.getId());
        return "inicio";
    }
}
