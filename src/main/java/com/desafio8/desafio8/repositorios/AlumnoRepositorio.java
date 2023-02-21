package com.desafio8.desafio8.repositorios;

import com.desafio8.desafio8.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno,String> {


@Query("SELECT a FROM Alumno a WHERE a.nombre = :nombre")
public Alumno buscarPorNombre(@Param("nombre") String nombre);

@Query("SELECT a FROM Alumno a WHERE a.id = :id")
public Alumno findById(@Param("id") int id);








}
