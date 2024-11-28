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

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/eliminar")
public class EliminarController {
    private final UsuarioRepository usuarioRepository;
    private final HttpSession httpSession;

    @Autowired
    public EliminarController(UsuarioRepository usuarioRepository, HttpSession httpSession, UsuarioService usuarioService) {
        this.usuarioRepository = usuarioRepository;
        this.httpSession = httpSession;
    }

    @GetMapping
    public String mostrarDatos () {
        return "eliminar";
    }

    @PostMapping("/desloguear")
    public String desloguear(HttpSession session) {
        session.invalidate();
        return "index";
    }

    @PostMapping("/confirmar")
    public String confirmar(@RequestParam String password, Model model) {
        Long usuarioId = (long) httpSession.getAttribute("LoginUsuarioID");

        Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);

        if (usuario.isPresent()) {
            String contrasena = usuario.get().getPassword();
            if (password.equals(contrasena)) {
                usuarioRepository.deleteById(usuarioId);

                model.addAttribute("UsuarioEliminado", true);

                return "index";
            }else {
                model.addAttribute("ErrorPassword", true);
                return "eliminar";
            }
        }
        model.addAttribute("cancelado", true);
       return "inicio";
    }
}
