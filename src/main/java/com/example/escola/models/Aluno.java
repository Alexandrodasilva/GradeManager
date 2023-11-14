package com.example.escola.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno extends Usuario {
    @Column(name = "matricula")
    private Long matricula;

    @ManyToOne
    @JoinColumn(name = "fk_turma")
    private Turma turma;

    // Getters and setters
    
    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

}
