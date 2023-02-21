package com.desafio8.desafio8.repositorios;

import com.desafio8.desafio8.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso,String> {

    @Query("SELECT c FROM Curso c WHERE c.id = :id")
    public Curso findById (@Param("id") int id);

    @Query("SELECT c FROM Curso c WHERE c.nombre = :nombre")
    public Curso buscarPorNombre (@Param("nombre") String nombre);

    @Query("SELECT c FROM Curso c WHERE c.turno = :turno")
    public Curso buscarPorCurso (@Param("turno")String turno);







}
