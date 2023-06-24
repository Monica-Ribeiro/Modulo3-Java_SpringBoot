package com.api.loja.controller;
import com.api.loja.model.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class LojaController {
    private List<Produto> produtos = new ArrayList<>();
    public LojaController(){
        produtos.add(new Produto(123,"Edredom Queen",950));
        produtos.add(new Produto(376,"Moletom unisex cinza",100));
        produtos.add(new Produto(951,"Tênis AllStar preto",250));
    }
    @GetMapping
    public List<Produto> getAll(){
        return produtos;
    }
    @GetMapping("/{codigoDeBarras}")
    public Produto getBycodigoDeBarras(@PathVariable int codigoDeBarras){
        for(Produto produto:produtos){
            if (produto.getCodigoDeBarras() == codigoDeBarras){
                return produto;
            }
        }
        return null;
    }
    @PostMapping
    public String save(@RequestBody Produto produto){
        produto.getCodigoDeBarras();
        for (Produto produtoDaLista: produtos){
            if (produto.getCodigoDeBarras() == produtoDaLista.getCodigoDeBarras()){
                return "Produto já existente!";
            }
        }
        this.produtos.add(produto);
        return "O produto " + produto.getNome() + " foi adicionado com sucesso!";
    }
}
