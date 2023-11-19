package com.example.escola.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.escola.models.Turma;
import com.example.escola.service.TurmaService;
import jakarta.validation.Valid;

@RequestMapping("Turma")
@Controller
public class TurmaController {
    final TurmaService turmaService;

    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @PostMapping("/criar")
    public String saveEntity(@ModelAttribute("turma") @Valid Turma turma) {
        turmaService.save(turma);
        return "redirect:/turma/turmaLista";
    }

    @GetMapping
    public String index(final Model model) {
        List<Turma> t = turmaService.findAll();
        model.addAttribute("t", t);
        return "turma/turmaLista";
    }
}
