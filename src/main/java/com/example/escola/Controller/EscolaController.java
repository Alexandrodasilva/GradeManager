package com.example.escola.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/escola")
@RestController
public class EscolaController {
    
    @GetMapping
    public String teste(){
        return "teste";
    }
}
