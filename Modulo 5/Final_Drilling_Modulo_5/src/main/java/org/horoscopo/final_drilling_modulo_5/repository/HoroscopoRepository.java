package org.horoscopo.final_drilling_modulo_5.repository;

import org.horoscopo.final_drilling_modulo_5.model.Horoscopo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface HoroscopoRepository extends JpaRepository<Horoscopo,Long> {
    Optional<Horoscopo> findById(Long id);
    @Query("SELECT h FROM Horoscopo h WHERE :fechaNacimiento BETWEEN h.fechaInicio AND h.fechaFin")
    Optional<Horoscopo> findByFechaInicioAndFechaFin(@Param("fechaNacimiento") LocalDate fechaNacimiento);
}
/*
 * Con el uso de Spring Data JPA, se  simplificado las operaciones CRUD eliminando la necesidad de
 * manejar manualmente las conexiones a la base de datos y las consultas SQL. Spring Data JPA maneja
 * automáticamente las operaciones de inserción, actualización, eliminación y consulta, mediante el
 * uso de repositorios que extienden JpaRepository.
 *
 * Consultas personalizadas se pueden definir de manera sencilla, ya sea utilizando métodos derivados
 * o mediante la anotación @Query.
 * También genera automáticamente otros métodos CRUD como:
 *
 *  List<Horoscopo> findAll();         // Para obtener todos los horóscopos
 *  void deleteById(Long id);         // Para eliminar por ID
 *  <Horoscopo> save(Horoscopo entity); // Para guardar o actuali
 */

