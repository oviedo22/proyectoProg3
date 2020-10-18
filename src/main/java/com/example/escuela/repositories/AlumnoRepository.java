package com.example.escuela.repositories;

import com.example.escuela.entities.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno, Long> {
}
