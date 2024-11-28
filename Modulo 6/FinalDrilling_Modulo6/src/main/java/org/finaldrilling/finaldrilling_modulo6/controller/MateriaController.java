package org.finaldrilling.finaldrilling_modulo6.controller;

import org.finaldrilling.finaldrilling_modulo6.model.Materia;
import org.finaldrilling.finaldrilling_modulo6.services.MateriaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    @Autowired
    private MateriaServices materiaServices;

    @PostMapping
    public Materia save(Materia materia){
        return materiaServices.save(materia);
    }
}
