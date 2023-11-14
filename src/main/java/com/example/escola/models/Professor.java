package com.example.escola.models;

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
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}
