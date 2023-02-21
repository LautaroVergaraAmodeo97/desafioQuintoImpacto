package com.desafio8.desafio8.repositorios;

import com.desafio8.desafio8.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor,String> {

    @Query("SELECT p FROM Profesor p WHERE p.id = :id")
    public Profesor findById(@Param("id") int id);

    @Query("SELECT p FROM Profesor p WHERE p.nombre = :nombre")
    public Profesor buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT p FROM Profesor p WHERE p.apellido = :apellido")
    public Profesor buscarPorApellido(@Param("apellido") String apellido);









}