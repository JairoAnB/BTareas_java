package org.horoscopo.final_drilling_modulo_5.dto;

public class UsuarioLoginDTO {
    private Long id;
    private String email;
    private String password;

    public UsuarioLoginDTO() {
    }

    public UsuarioLoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UsuarioLoginDTO(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioLoginDTO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
