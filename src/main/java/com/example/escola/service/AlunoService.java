package com.example.escola.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.escola.models.Aluno;
import com.example.escola.repository.AlunoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlunoService {
    final private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    /**
     * @param aluno
     * @return
     */
    @Transactional // Ao executar esse método. Se ocorrer uma exceção durante a execução do método
                   // anotado, o Spring faz rollback da transação,
    // revertendo todas as operações feitas até o ponto em que a exceção foi
    // lançada.
    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    /**
     * @param aluno
     * @return
     */
    @Transactional
    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }

    @Transactional
    public Aluno findById(long id) {
        return findById(id);
    }

    @Transactional
    public List<Aluno> findAll() {
        return findAll();
    }

}
