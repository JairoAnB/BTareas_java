package org.finaldrilling.finaldrilling_modulo6.services;

import org.finaldrilling.finaldrilling_modulo6.dto.AlumnoDTO;
import org.finaldrilling.finaldrilling_modulo6.mapper.AlumnoMapper;
import org.finaldrilling.finaldrilling_modulo6.model.Alumno;
import org.finaldrilling.finaldrilling_modulo6.model.User;
import org.finaldrilling.finaldrilling_modulo6.repository.AlumnoRepository;
import org.finaldrilling.finaldrilling_modulo6.repository.UserRepository;
import org.finaldrilling.finaldrilling_modulo6.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoServices {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoDTO save(AlumnoDTO alumnoDTO){
        Alumno alumno = AlumnoMapper.toAlumnoEntity(alumnoDTO);
        alumno = alumnoRepository.save(alumno);

        return AlumnoMapper.toAlumnoDTO(alumno);
    }
    public Alumno save(Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    public List<AlumnoDTO> findAll(){
        List<Alumno> alumnos = alumnoRepository.findAll();
        List<AlumnoDTO> alumnoDTOS = new ArrayList<>();
        for(Alumno alumno: alumnos){
            alumnoDTOS.add(AlumnoMapper.toAlumnoDTO(alumno));
        }
        return alumnoDTOS;
    }
}
