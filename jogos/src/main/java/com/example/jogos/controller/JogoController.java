package com.example.jogos.controller;
import com.example.jogos.model.Jogo;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/jogo")
public class JogoController {
    public List<Jogo> jogos = new ArrayList<>();
    public JogoController(){
        jogos.add(new Jogo(1, "Sonic 2", 45));
        jogos.add(new Jogo(2, "Gears of war 5", 65));
        jogos.add(new Jogo(3, "Tomb Raider 3", 57));
        jogos.add(new Jogo(4, "A plague tale", 54));
    }
    @GetMapping
    public List<Jogo> getAll(){
        return jogos;
    }
    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id){
        for (Jogo jogo: jogos){
            if (jogo.getId() == id){
                return jogo;
            }
        }
        return null;
    }
    @GetMapping("/menor-preco")
    public Jogo getByMenorPreco(){
        double menorPreco = 1000;
        int index = 0;
        for (Jogo jogo: jogos){
            if (jogo.getPreco() < menorPreco){
                menorPreco = jogo.getPreco();
                index = jogo.getId() - 1;
            }
        }
        return jogos.get(index);
    }
    @PostMapping
    public String save(@RequestBody Jogo jogo){
        jogo.getPreco();
        for (Jogo jogosDaLista: jogos){
            if (jogo.getPreco() == jogosDaLista.getPreco()){
                return "Produto já existente!";
            }
        }
        this.jogos.add(jogo);
        return "O jogo " + jogo.getNome() + " foi adicionado com sucesso!";
    }
}
