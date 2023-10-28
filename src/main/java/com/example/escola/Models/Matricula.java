package com.example.escola.Models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name="id")
    private Long id;
    @Column(name="fk_aluno")
    private Aluno aluno;
    @Column(name="fk_disciplina")
    private Disciplina disciplina;
    @Column(name="nota1")
    private Float nota1;
    @Column(name="nota2")
    private Float nota2;
    @Column(name="nota3")
    private Float nota3;
    @Column(name="nota4")
    private Float nota4;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Float getNota1() {
        return nota1;
    }
    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }
    public Float getNota2() {
        return nota2;
    }
    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }
    public Float getNota3() {
        return nota3;
    }
    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }
    public Float getNota4() {
        return nota4;
    }
    public void setNota4(Float nota4) {
        this.nota4 = nota4;
    }
}
