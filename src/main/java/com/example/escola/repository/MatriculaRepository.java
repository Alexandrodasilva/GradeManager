package com.example.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.escola.models.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    
}
