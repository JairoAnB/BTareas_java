package org.horoscopo.final_drilling_modulo_5.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.horoscopo.final_drilling_modulo_5.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/animal")
public class HoroscopoController {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public HoroscopoController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/desloguear")
    public String desloguear(HttpSession session) {
        session.invalidate();
        return "index";
    }

    @GetMapping
    public String mostrarDatos(HttpSession session, Model model, HttpServletRequest request) {

        Long registroId = (Long) session.getAttribute("LoginUsuarioID");

        if (registroId != null) {
            Optional<Usuario> usuarioOptional = usuarioRepository.findById(registroId);
            if (usuarioOptional.isPresent()) {
                model.addAttribute("usuario", usuarioOptional.get());
                return "animal";
            }
        }
        return "redirect:/";
    }
}
