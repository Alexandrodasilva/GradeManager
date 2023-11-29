// package com.example.escola.models.defasado;

// import java.util.List;

// import jakarta.persistence.*;

// @Entity
// @Table(name = "turma")
// public class Turma {
//     @Id
//     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
//     @SequenceGenerator(name = "sequenceGenerator", sequenceName = "SEQUENCE_NAME", allocationSize = 1)
//     @Column(name = "id")
//     private Long id;

//     @Column(name = "nomeTurma")
//     private String nomeTurma;

//     // @ManyToMany(mappedBy = "Alunos")
//     // private List<Aluno> alunos;

//     @OneToMany(mappedBy = "turma")
//     private List<Disciplina> disciplina;

//     // Getters and setters
    
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getNomeTurma() {
//         return nomeTurma;
//     }

//     public void setNomeTurma(String nomeTurma) {
//         this.nomeTurma = nomeTurma;
//     }

//     // public List<Aluno> getAlunos() {
//     //         return alunos;
//     // }

//     // public void setAlunos(List<Aluno> alunos) {
//     //         this.alunos = alunos;
//     // }

//     public List<Disciplina> getDisciplina() {
//             return disciplina;
//     }

//     public void setDisciplina(List<Disciplina> disciplina) {
//             this.disciplina = disciplina;
//     }
    
// }