package com.example.escola.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.escola.models.Professor;
import com.example.escola.repository.ProfessorRepository;

@Service
public class ProfessorService {

    final private ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(Long id) {
        return professorRepository.findById(id);
    }

    public void deleteById(Long id) {
        professorRepository.deleteById(id);
    }
}
