package com.example.escola.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
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

    // @GetMapping
    // public String teste(){
    //     return "teste";
    // }
    
    @PostMapping
    public ResponseEntity<Object> saveEntity(@RequestBody @Valid Turma turma){
        return ResponseEntity.status(HttpStatus.CREATED).body(turmaService.save(turma));
    }
}