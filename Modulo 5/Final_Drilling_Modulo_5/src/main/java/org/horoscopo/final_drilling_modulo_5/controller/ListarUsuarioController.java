package org.horoscopo.final_drilling_modulo_5.controller;

import jakarta.servlet.http.HttpSession;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.horoscopo.final_drilling_modulo_5.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class ListarUsuarioController {

    private final UsuarioRepository usuarioRepository;
    public ListarUsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @PostMapping("/desloguear")
    public String desloguear(HttpSession session) {
        session.invalidate();
        return "index";
    }
    @GetMapping
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";


    }

}
