package org.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/perucas")
public class PerucaController {
    @GetMapping
    public String boasVindas(){
        return "Seja bem vindo a queen hair!!!";
    }
    @GetMapping("/multiplica/{numero}")
    public int multiplicaPor2(@PathVariable int numero){
        return numero * 2;
    }

    @GetMapping("/cunprimenta/{nome}")
    public String cumprimentaPeloNome(@PathVariable String nome){
        return "Olá " + nome;
    }

    @GetMapping("/tipos")
    public List<String> getTiposPerucas(){
        List<String> tiposDePerucas = new ArrayList<>();
        tiposDePerucas.add("Front Lace");
        tiposDePerucas.add("Wig");
        tiposDePerucas.add("Topos");
        return tiposDePerucas;
    }

}
