package com.example.escola.Models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator", sequenceName = "SEQUENCE_NAME", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_disciplina")
    private String nomeDisciplina;

    @ManyToOne
    @JoinColumn(name = "fk_turma")
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "fk_professor")
    private Professor professor;

    @OneToMany(mappedBy = "disciplina")
    private List<Matricula> matriculas;

    // Getters and setters
}

