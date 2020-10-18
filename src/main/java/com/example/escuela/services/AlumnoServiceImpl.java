package com.example.escuela.services;

import com.example.escuela.entities.Alumno;
import com.example.escuela.repositories.AlumnoRepository;
import com.example.escuela.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno,Long> implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository) {
        super(baseRepository);
    }
}
