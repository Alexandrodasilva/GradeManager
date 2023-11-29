package com.example.escola.models;

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
    @JoinColumn(name = "fk_professor")
    private Professor professor;
 
    @JoinColumn(name = "aluno")
    private List<Aluno> aluno;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getAluno(){
        return aluno;
    }
    public void setAluno(List<Aluno> aluno){
        this.aluno = aluno;
    }
}

