package com.example.escola.Models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "SEQUENCE_NAME", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_turma")
    private String nomeTurma;

    @ManyToMany(mappedBy = "turma")
    private List<Aluno> alunos;

    @OneToMany(mappedBy = "turma")
    private List<Disciplina> disciplinas;

    // Getters and setters
}