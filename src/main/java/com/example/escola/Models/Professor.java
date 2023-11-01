package com.example.escola.Models;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "professor")
public class Professor extends Usuario {
    @ManyToMany
    @JoinTable(name = "professor_disciplina",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    // Getters and setters
}
