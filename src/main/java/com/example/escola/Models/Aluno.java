package com.example.escola.Models;

import java.util.List;

import jakarta.persistence.*;

public class Aluno extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name="id")
    private Long id;
    @Column(name="matricula")
    private Long Matricula;
    @Column(name="fk_turma")
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getMatricula() {
        return Matricula;
    }
    public void setMatricula(Long matricula) {
        Matricula = matricula;
    }

}
