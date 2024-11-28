package org.finaldrilling.finaldrilling_modulo6.controller;

import org.finaldrilling.finaldrilling_modulo6.model.User;
import org.finaldrilling.finaldrilling_modulo6.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String signup(@RequestBody User user){
        return userService.signup(user);
    }

    @PostMapping("/signin")
    public String signin(@RequestParam String username, @RequestParam String password) {
        return userService.signin(username, password);
    }
}
