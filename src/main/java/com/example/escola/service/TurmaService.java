package com.example.escola.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.escola.models.Turma;
import com.example.escola.repository.TurmaRepository;

import jakarta.transaction.Transactional;

@Service
public class TurmaService {
    final private TurmaRepository turmaRepository;

    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }
    @Transactional
    public Turma save(Turma turma) {
        return turmaRepository.save(turma);
    }
    @Transactional
    public List<Turma> findAll() {
        return turmaRepository.findAll();
    }
    @Transactional
    public Optional<Turma> findById(Long id) {
        return turmaRepository.findById(id);
    }
    @Transactional
    public void deleteById(Long id) {
        turmaRepository.deleteById(id);
    }
}
