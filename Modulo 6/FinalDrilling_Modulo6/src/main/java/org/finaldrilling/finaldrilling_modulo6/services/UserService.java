package org.finaldrilling.finaldrilling_modulo6.services;

import org.finaldrilling.finaldrilling_modulo6.model.User;
import org.finaldrilling.finaldrilling_modulo6.repository.UserRepository;
import org.finaldrilling.finaldrilling_modulo6.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public String signin(String username, String password){
        User user = userRepository.findByUsername(username).orElseThrow(()->new RuntimeException("Usuario no encontrado"));
        if (!passwordEncoder.matches(password, user.getPassword())){
            throw new RuntimeException("Contraseña incorrecta");
        }
        return jwtTokenProvider.generateToken(username);
    }

    public String signup(User user){
        if(userRepository.findByUsername(user.getUsername()).isPresent()){
            throw new RuntimeException("El usuario ya existe");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user).getUsername();
    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
