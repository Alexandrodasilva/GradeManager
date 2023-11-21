package com.example.escola.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.escola.models.Aluno;
import com.example.escola.models.Matricula;
import com.example.escola.service.AlunoService;
import com.example.escola.service.MatriculaService;

import jakarta.validation.Valid;

@RequestMapping(name="matricula")
@Controller
public class MatriculaController {
    final private MatriculaService matriculaService;
    final private AlunoService alunoService;
    public MatriculaController(MatriculaService matriculaService, AlunoService alunoService){
        this.matriculaService = matriculaService;
        this.alunoService = alunoService;
    }

    @PostMapping("/new")
    public ResponseEntity<Matricula> saveEntity(@Valid Matricula matricula){
        Aluno aluno = alunoService.save(matricula.getAluno());
        matricula.setAluno(aluno);
        matriculaService.save(matricula);
        return ResponseEntity.status(HttpStatus.Ok).body();
    }

}
