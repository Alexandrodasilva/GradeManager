package com.example.escola.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "matricula")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "SEQUENCE_NAME", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "fk_disciplina")
    private Disciplina disciplina;

    @Column(name = "nota1")
    private Float nota1;

    @Column(name = "nota2")
    private Float nota2;

    @Column(name = "nota3")
    private Float nota3;

    @Column(name = "nota4")
    private Float nota4;

    // Getters and setters
    
}
