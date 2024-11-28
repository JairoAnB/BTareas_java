package org.finaldrilling.finaldrilling_modulo6.dto;

public class LoginDTO {

    private String token;
    private String tipo;

    public LoginDTO() {
    }

    public LoginDTO(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "token='" + token + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

