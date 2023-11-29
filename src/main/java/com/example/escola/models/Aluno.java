package com.example.escola.models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno extends Usuario {
    @Column(name = "matricula")
    private Long matricula;

    @Column(name = "nota1")
    private Float nota1;

    @Column(name = "nota2")
    private Float nota2;

    @Column(name = "nota3")
    private Float nota3;

    @Column(name = "nota4")
    private Float nota4;

    // Getters and setters
    
    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
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
