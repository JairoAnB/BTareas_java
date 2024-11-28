package org.finaldrilling.finaldrilling_modulo6.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.finaldrilling.finaldrilling_modulo6.dto.AlumnoDTO;
import org.finaldrilling.finaldrilling_modulo6.dto.UserDTO;
import org.finaldrilling.finaldrilling_modulo6.model.User;
import org.finaldrilling.finaldrilling_modulo6.services.AlumnoServices;
import org.finaldrilling.finaldrilling_modulo6.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {

    private final UserService userService;
    private final AlumnoServices alumnoServices;

    public LoginController(UserService userService, AlumnoServices alumnoServices) {
        this.userService = userService;
        this.alumnoServices = alumnoServices;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, HttpServletRequest request){
        String token = userService.signin(username,password);
        request.getSession().setAttribute("token", token);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model) {

        List<AlumnoDTO> alumnos = alumnoServices.findAll();
        model.addAttribute("alumnos", alumnos);
        return "home";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(UserDTO userDTO,@RequestParam String username, @RequestParam String password ){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.signup(user);
        return "redirect:/login";
    }
}
