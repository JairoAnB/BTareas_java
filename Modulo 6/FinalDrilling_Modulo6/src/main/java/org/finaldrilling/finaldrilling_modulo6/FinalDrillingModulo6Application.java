package org.finaldrilling.finaldrilling_modulo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class FinalDrillingModulo6Application {

    public static void main(String[] args) {
        SpringApplication.run(FinalDrillingModulo6Application.class, args);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("hola");
        System.out.println(encodedPassword);
    }

}
