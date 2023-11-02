package com.example.escola.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.escola.models.Disciplina;
import com.example.escola.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
    final private DisciplinaRepository disciplinaRepository;
    public DisciplinaService(DisciplinaRepository disciplinaRepository){
        this.disciplinaRepository = disciplinaRepository;
    }
    
    public Disciplina save(Disciplina disciplina){
        return disciplinaRepository.save(disciplina);
    }
    public List<Disciplina> findAll(){
        return disciplinaRepository.findAll();
    }
    public Optional<Disciplina> findById(Long id){
        return disciplinaRepository.findById(id);
    }

    public void deleteById(long id){
        disciplinaRepository.deleteById(id);
    }
}
