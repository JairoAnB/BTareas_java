package org.finaldrilling.finaldrilling_modulo6.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtAuthentication implements Authentication {

    private final String token;
    private final Object principal;
    private final Collection<? extends GrantedAuthority> authorities;
    private boolean authenticated;
    private Object details;


    public JwtAuthentication(String token, Object principal, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.principal = principal;
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    public void setDetails(Object details) {
        this.details = details;
    }
    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        this.authenticated = isAuthenticated;
    }

    @Override
    public String getName() {
        return null;
    }
}
