package com.desafio8.desafio8.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "turno")
    private String turno;

    @Column(name = "horario")
    private String horario;

    @ManyToMany
    private ArrayList<Profesor> profesores;

    @ManyToMany
    private ArrayList<Alumno> alumnos;




}
