package org.finaldrilling.finaldrilling_modulo6.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles = new ArrayList<>();
}
