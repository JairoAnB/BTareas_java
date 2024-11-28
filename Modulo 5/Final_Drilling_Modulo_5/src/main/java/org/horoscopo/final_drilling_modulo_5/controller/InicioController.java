package org.horoscopo.final_drilling_modulo_5.controller;

import jakarta.servlet.http.HttpSession;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.horoscopo.final_drilling_modulo_5.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/inicio")
public class InicioController {

    private final UsuarioRepository usuarioRepository;
    private final HttpSession httpSession;

    public InicioController(UsuarioRepository usuarioRepository, HttpSession httpSession) {
        this.usuarioRepository = usuarioRepository;
        this.httpSession = httpSession;
    }

    @PostMapping("/desloguear")
    public String desloguear(HttpSession session) {
        session.invalidate();
        return "index";
    }

    @GetMapping
    public String usuario(Model model) {
        Long usuarioId = (Long) httpSession.getAttribute("LoginUsuarioID");
        if (usuarioId == null) {
            return "index";
        }

        Optional<Usuario> usuarioOptional = usuarioRepository.findById(usuarioId);
        if (usuarioOptional.isPresent()) {
            model.addAttribute("usuario", usuarioOptional.get());
            System.out.println("Usuario encontrado: " + usuarioOptional.get().getNombre());
        } else {
            System.out.println("usuario no encontrado");
            return "index";
        }

        return "inicio";
    }
}
