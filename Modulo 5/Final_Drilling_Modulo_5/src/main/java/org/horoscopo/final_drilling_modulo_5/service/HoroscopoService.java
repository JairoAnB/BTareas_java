package org.horoscopo.final_drilling_modulo_5.service;

import org.horoscopo.final_drilling_modulo_5.model.Horoscopo;
import org.horoscopo.final_drilling_modulo_5.repository.HoroscopoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class HoroscopoService {

    @Autowired //Inyectamos dependencias automaticamente
    private HoroscopoRepository horoscopoRepository;

    public List<Horoscopo>listarHoroscopo(){
        return horoscopoRepository.findAll(); //Busco todos los horoscopos disponibles
    }
    public void insertarHoroscopo(Horoscopo horoscopo){
        horoscopoRepository.save(horoscopo); //Inserto o actualizo un horoscopo
    }
    public Optional<Horoscopo> findById(Long id){
        return horoscopoRepository.findById(id); //Busco el horoscopo mediannte la id
    }
    public void actualizarHoroscopo(Horoscopo horoscopo){
        horoscopoRepository.save(horoscopo); //Actualizo el horoscopo
    }
    public void eliminarHoroscopo(Long id){
        horoscopoRepository.deleteById(id); //Elimino por por la id
    }

    public String obtenerSigno(LocalDate fechaNacimiento){
        Optional<Horoscopo> horoscopo = horoscopoRepository.findByFechaInicioAndFechaFin(fechaNacimiento);
        if(horoscopo.isPresent()){
            return horoscopo.get().getAnimal();
        } else {
            return "Desconocido";
        }
    }
}
