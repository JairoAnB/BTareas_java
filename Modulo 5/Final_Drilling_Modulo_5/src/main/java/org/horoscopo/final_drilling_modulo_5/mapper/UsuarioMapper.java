package org.horoscopo.final_drilling_modulo_5.mapper;

import lombok.experimental.UtilityClass;
import org.horoscopo.final_drilling_modulo_5.dto.UsuarioDTO;
import org.horoscopo.final_drilling_modulo_5.dto.UsuarioDtoCreate;
import org.horoscopo.final_drilling_modulo_5.dto.UsuarioUpdateDTO;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;

@UtilityClass
public class UsuarioMapper {

    public static UsuarioDTO convertirDTO(Usuario usuario){
        return new UsuarioDTO(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getUsername(),
                usuario.getEmail(),
                usuario.getFechaNacimiento(),
                usuario.getPassword(),
                usuario.getAnimal()
        );
    }
    public static Usuario toEntity(UsuarioDtoCreate dto){
        return new Usuario(dto.getId(), dto.getNombre(),dto.getUsername(), dto.getEmail(), dto.getFechaNacimiento(), dto.getPassword(), dto.getAnimalHoroscopo());
    }
    public static Usuario toEntity(UsuarioUpdateDTO dto){
        return new Usuario(dto.getId(), dto.getNombre(), dto.getCorreo(), dto.getPassword(), dto.getUsername());
    }
}
