package org.horoscopo.final_drilling_modulo_5.service;

import org.horoscopo.final_drilling_modulo_5.dto.UsuarioDTO;
import org.horoscopo.final_drilling_modulo_5.dto.UsuarioLoginDTO;
import org.horoscopo.final_drilling_modulo_5.model.Usuario;
import org.horoscopo.final_drilling_modulo_5.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Servicio encargado de la lógica de negocio relacionada con la gestión de usuarios.
 * Utiliza el repositorio de usuarios para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * y realizar la búsqueda de usuarios por correo electrónico.
 *
 * Métodos:
 * - listarUsuarios(): Recupera la lista completa de usuarios almacenados.
 * - insertarUsuario(Usuario usuario): Inserta un nuevo usuario en la base de datos.
 * - actualizarUsuario(Usuario usuario): Actualiza los datos de un usuario existente.
 * - eliminarUsuario(String email): Elimina un usuario de la base de datos utilizando su correo electrónico.
 * - buscarUsuario(String username): Busca un usuario por su correo electrónico y devuelve un DTO con sus datos de inicio de sesión.
 */

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Listo usuarios

    public List<Usuario>listarUsuarios(){
        return usuarioRepository.findAll();
    }
    public void insertarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public void actualizarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public void eliminarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }

    public Optional<UsuarioLoginDTO> buscarUsuario(String email){
        Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(email);
        return usuarioOptional.map(usuario -> new UsuarioLoginDTO(usuario.getEmail(), usuario.getPassword()));
    }

}
