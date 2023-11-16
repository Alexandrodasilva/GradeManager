package com.example.escola.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.escola.models.Turma;
import com.example.escola.service.TurmaService;
import jakarta.validation.Valid;

@RequestMapping("Turma")
// @RestController
@Controller
public class TurmaController {
    final TurmaService turmaService;

    // construtor
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    // @PostMapping
    // public ResponseEntity<Object> saveEntity(@RequestBody @Valid Turma turma) {
    // return
    // ResponseEntity.status(HttpStatus.CREATED).body(turmaService.save(turma));
    // }

    @GetMapping("/listar")
    public String index(final Model model) {
        List<Turma> t = turmaService.findAll();
        model.addAttribute("t", t);
        return "turma/turmaLista";
    }

    // Esse endopoint que retorna a operação HTTP GET, o ResponseEntity é o tipo de
    // retorno do método, com o status OK(200)
    // ResponseEntity representa a resposta HTTP do spring Framework, o
    // status(HTTpStatus.OK) define o codigo de retorno OK(200) Sucesso, já o BODY,
    // esse método é definido que o que retorna
    // @GetMapping
    // public ResponseEntity<List<Turma>> getAll() {
    // return ResponseEntity.status(HttpStatus.OK).body(turmaService.findAll());
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<Object> getID(@PathVariable @Valid Long id) {
    // Optional<Turma> turma = turmaService.findById(id);
    // if (!turma.isPresent()) {
    // ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
    // }
    // return ResponseEntity.status(HttpStatus.OK).body(turma);
    // }
}
