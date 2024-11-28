package org.finaldrilling.finaldrilling_modulo6.controller;

import org.finaldrilling.finaldrilling_modulo6.dto.AlumnoDTO;
import org.finaldrilling.finaldrilling_modulo6.model.Alumno;
import org.finaldrilling.finaldrilling_modulo6.services.AlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoApiController {

    @Autowired
    private AlumnoServices alumnoServices;

    @GetMapping
    public List<AlumnoDTO> findAll() {
        return alumnoServices.findAll();
    }

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno) {
        return alumnoServices.save(alumno);
    }
}
