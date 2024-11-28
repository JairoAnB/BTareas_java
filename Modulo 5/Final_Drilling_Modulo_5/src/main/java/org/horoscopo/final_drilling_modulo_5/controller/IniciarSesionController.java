package org.horoscopo.final_drilling_modulo_5.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.horoscopo.final_drilling_modulo_5.dto.UsuarioLoginDTO;
import org.horoscopo.final_drilling_modulo_5.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Optional;

/**
 * Controlador encargado de gestionar el inicio de sesión de los usuarios en la aplicación.
 * Recibe las solicitudes POST de inicio de sesión y valida las credenciales de los usuarios.
 * Utiliza el servicio de usuarios para verificar la existencia del usuario y comprobar la validez de la contraseña.
 *
 * Métodos:
 * - iniciarSesion(String usuario, String contrasena, Model model):
 *   Procesa el inicio de sesión de un usuario. Si las credenciales son correctas, redirige a la página de inicio.
 *   Si la contraseña es incorrecta o el usuario no existe, redirige al índice con un mensaje de error.
 */
@Controller
@SessionAttributes("usuarioEncontrado")
@RequestMapping("/login")
public class IniciarSesionController {

    private final UsuarioService usuarioService;
    private final HttpSession httpSession;

    @Autowired
    public IniciarSesionController(UsuarioService usuarioService, HttpSession httpSession) {
        this.usuarioService = usuarioService;
        this.httpSession = httpSession;
    }

    @PostMapping("/iniciarSesion")
    public String iniciarSesion(@RequestParam String email, @RequestParam String contrasena, Model model, HttpServletResponse response) {
        Optional<UsuarioLoginDTO> usuarioOptional = usuarioService.buscarUsuario(email);

        if(email == null || email.isEmpty()){
            model.addAttribute("ErrorCorreoEmpty", "El correo no puede estar vacio");
        }

        if(contrasena == null || contrasena.isEmpty()){
            model.addAttribute("ErrorPasswordEmpty", "La contraseña no puede estar vacia");
        }

        if(model.containsAttribute("ErrorCorreoEmpty") || model.containsAttribute("ErrorPasswordEmpty")){
            return "index";
        }

        if (usuarioOptional.isPresent()) {
            UsuarioLoginDTO usuarioEncontrado = usuarioOptional.get();
            model.addAttribute("usuarioEncontrado", usuarioEncontrado);
            if (usuarioEncontrado.getPassword().equals(contrasena)) {
                httpSession.setAttribute("LoginUsuarioID", usuarioEncontrado.getId());
                return "inicio";
            } else {
                model.addAttribute("passwordInvalida", true);
                return "index";
            }
        } else {
            model.addAttribute("usuarioInvalido", true);
            return "index";
        }
    }
}
