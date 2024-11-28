package org.horoscopo.final_drilling_modulo_5.controller;


import jakarta.servlet.http.HttpSession;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.horoscopo.final_drilling_modulo_5.repository.UsuarioRepository;
import org.horoscopo.final_drilling_modulo_5.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/modificar")
public class ModificarController {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioService usuarioService;
    private final HttpSession httpSession;

    @Autowired
    public ModificarController(UsuarioRepository usuarioRepository, UsuarioService usuarioService, HttpSession httpSession) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioService = usuarioService;
        this.httpSession = httpSession;
    }

    @GetMapping
    public String mostrarDatos () {
        return "modificar";
    }

    @PostMapping("/desloguear")
    public String desloguear(HttpSession session) {
        session.invalidate();
        return "index";
    }
    @PostMapping("/modificarDatos")
    public String modificarDatos(@RequestParam String nombre, @RequestParam String username, @RequestParam String email, @RequestParam String password, Model model) {
        Long usuarioId = (long) httpSession.getAttribute("LoginUsuarioID");

        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);

        if (usuario.isPresent()) {
            usuario.get().setNombre(nombre);
            usuario.get().setUsername(username);
            usuario.get().setEmail(email);
            usuario.get().setPassword(password);
            usuarioRepository.save(usuario.get());

            model.addAttribute("actualizado", true);
            return "inicio";
        }
        return "inicio";
    }
}

