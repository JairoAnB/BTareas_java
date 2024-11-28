package org.finaldrilling.finaldrilling_modulo6.controller;

import org.finaldrilling.finaldrilling_modulo6.dto.AlumnoDTO;
import org.finaldrilling.finaldrilling_modulo6.model.Alumno;
import org.finaldrilling.finaldrilling_modulo6.services.AlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoServices alumnoServices;

    @GetMapping
    public String listarAlumnos(Model model) {
        List<AlumnoDTO> alumnos = alumnoServices.findAll();
        model.addAttribute("alumnos", alumnos);
        return "alumnos"; }

    @GetMapping("/nuevo")
    public String crearAlumno(Model model) {
        model.addAttribute("alumno", new AlumnoDTO());
        return "alumno";
    }

    @PostMapping
    public String crearAlumnos(@ModelAttribute AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoDTO.getNombre());
        alumno.setRut(alumnoDTO.getRut());
        alumno.setDireccion(alumnoDTO.getDireccion());
        alumnoServices.save(alumno);
        return "redirect:/alumnos";
    }
}
