package org.finaldrilling.finaldrilling_modulo6.services;

import org.finaldrilling.finaldrilling_modulo6.model.Materia;
import org.finaldrilling.finaldrilling_modulo6.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaServices {

    @Autowired
    private MateriaRepository materiaRepository;

    public Materia save(Materia materia){
        return materiaRepository.save(materia);
    }

}
