package com.example.lojasgamesback.service;

import com.example.lojasgamesback.model.Jogo;
import com.example.lojasgamesback.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Jogo> getAll(){
        return bancoDeDados.findAll();
    }
}
