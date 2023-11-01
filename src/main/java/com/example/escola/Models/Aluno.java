package com.example.escola.Models;

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
}
