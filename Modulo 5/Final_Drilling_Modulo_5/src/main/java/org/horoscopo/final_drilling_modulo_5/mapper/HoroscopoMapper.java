package org.horoscopo.final_drilling_modulo_5.mapper;

import lombok.experimental.UtilityClass;
import org.horoscopo.final_drilling_modulo_5.dto.HoroscopoDTO;
import org.horoscopo.final_drilling_modulo_5.dto.HoroscopoDtoCreate;
import org.horoscopo.final_drilling_modulo_5.dto.HoroscopoUpdateDTO;
import org.horoscopo.final_drilling_modulo_5.model.Horoscopo;
/**
 * Clase utilitaria para mapear entre entidades del modelo {@link Horoscopo}
 * y objetos de transferencia de datos (DTO) relacionados.
 *
 * Métodos:
 * - convertirDTO: Convierte una entidad {@link Horoscopo} en un DTO {@link HoroscopoDTO}.
 * - toEntity: Convierte un DTO de creación {@link HoroscopoDtoCreate} en una entidad {@link Horoscopo}.
 *
 * Este mapeo asegura la separación entre la lógica de negocio y los objetos expuestos en las capas externas.
 */
@UtilityClass
public class HoroscopoMapper {

    public static HoroscopoDTO convertirDTO(Horoscopo horoscopo) {
        return new HoroscopoDTO(
                horoscopo.getId(),
                horoscopo.getAnimal(),
                horoscopo.getFechaInicio(),
                horoscopo.getFechaFin()
        );
    }
    public static Horoscopo toEntity(HoroscopoDtoCreate dto){
        return new Horoscopo(dto.getAnimal(), dto.getFechaInicio(), dto.getFechaFin());
    }
    public static Horoscopo toEntity(HoroscopoUpdateDTO dto){
        return new Horoscopo(dto.getId(), dto.getAnimal(), dto.getFechaInicio(), dto.getFechaFin());
    }
}
