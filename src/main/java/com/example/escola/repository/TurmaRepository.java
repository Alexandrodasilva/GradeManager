package com.example.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escola.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
    
}
