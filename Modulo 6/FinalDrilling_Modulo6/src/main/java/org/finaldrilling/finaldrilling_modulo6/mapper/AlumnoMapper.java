package org.finaldrilling.finaldrilling_modulo6.mapper;

import org.finaldrilling.finaldrilling_modulo6.dto.AlumnoDTO;
import org.finaldrilling.finaldrilling_modulo6.dto.MateriaDTO;
import org.finaldrilling.finaldrilling_modulo6.model.Alumno;
import org.finaldrilling.finaldrilling_modulo6.model.Materia;

import java.util.HashSet;
import java.util.Set;

public class AlumnoMapper {

    public static AlumnoDTO toAlumnoDTO(Alumno alumno) {
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setId(alumno.getId());
        alumnoDTO.setRut(alumno.getRut());
        alumnoDTO.setNombre(alumno.getNombre());
        alumnoDTO.setDireccion(alumno.getDireccion());

        Set<MateriaDTO> materiaDTOSet = new HashSet<>();
        for (Materia materia : alumno.getMateriaList()) {
            MateriaDTO materiaDTO = new MateriaDTO();
            materiaDTO.setId(materia.getId());
            materiaDTO.setNombre(materia.getNombre());
            materiaDTOSet.add(materiaDTO);
        }
        alumnoDTO.setMateriaList(materiaDTOSet);
        return alumnoDTO;
    }

    public static MateriaDTO toMateriaDTO(Materia materia) {
        if (materia == null) return null;

        MateriaDTO materiaDTO = new MateriaDTO();
        materiaDTO.setId(materia.getId());
        materiaDTO.setNombre(materia.getNombre());

        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setId(materia.getAlumno().getId());
        alumnoDTO.setNombre(materia.getAlumno().getNombre());
        alumnoDTO.setRut(materia.getAlumno().getRut());
        materiaDTO.setAlumno(alumnoDTO);

        return materiaDTO;
    }
    public static Alumno toAlumnoEntity(AlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno.setId(alumnoDTO.getId());
        alumno.setRut(alumnoDTO.getRut());
        alumno.setNombre(alumnoDTO.getNombre());
        alumno.setDireccion(alumnoDTO.getDireccion());

        return alumno;
    }
    public static Materia toMateriaEntity(MateriaDTO materiaDTO) {
        if (materiaDTO == null) return null;

        Materia materia = new Materia();
        materia.setId(materiaDTO.getId());
        materia.setNombre(materiaDTO.getNombre());
        Alumno alumno = new Alumno();
        alumno.setId(materiaDTO.getAlumno().getId());
        materia.setAlumno(alumno);

        return materia;
    }
}
