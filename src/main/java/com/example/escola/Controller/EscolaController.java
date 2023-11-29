// package com.example.escola.Controller;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.http.HttpStatus;

// import com.example.escola.models.defasado.Turma;
// import com.example.escola.service.defasado.TurmaService;

// import jakarta.validation.Valid;

// @RequestMapping("/schol")
// @RestController
// public class EscolaController {
//     final TurmaService turmaService;

//     // construtor
//     public EscolaController(TurmaService turmaService) {
//         this.turmaService = turmaService;
//     }

//     // @GetMapping
//     // public String teste(){
//     // return "teste";
//     // }

//     @PostMapping
//     public ResponseEntity<Object> saveEntity(@RequestBody @Valid Turma turma) {
//         return ResponseEntity.status(HttpStatus.CREATED).body(turmaService.save(turma));
//     }
// }