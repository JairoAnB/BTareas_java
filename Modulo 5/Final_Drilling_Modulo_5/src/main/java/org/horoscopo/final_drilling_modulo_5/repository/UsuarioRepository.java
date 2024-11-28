package org.horoscopo.final_drilling_modulo_5.repository;

import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario>findByEmail(String email); //Ocupar siempre nombres como "findBy... con camelcase (en minusculas la primera letra)"
    void deleteByEmail(String email); //Se ocupara poder eliminar por EMAIL
}
