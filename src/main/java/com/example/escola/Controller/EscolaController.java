package com.example.escola.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.escola.models.Turma;
import com.example.escola.service.TurmaService;

import jakarta.validation.Valid;

@RequestMapping("/schol")
@RestController
public class EscolaController {
    final TurmaService turmaService;
    
    //construtor
    public EscolaController(TurmaService turmaService){
        this.turmaService = turmaService;
    }

    @GetMapping
    public String teste(){
        return "teste";
    }
    
    @PostMapping
    public ResponseEntity<Turma> savEntity(@Valid Turma turma){
        var t = new Turma();
        turmaService.save(t);
        return null;
    }
}