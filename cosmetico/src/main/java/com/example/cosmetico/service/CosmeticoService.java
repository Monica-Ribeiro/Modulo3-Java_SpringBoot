package com.example.cosmetico.service;
import com.example.cosmetico.model.CosmeticoModel;
import com.example.cosmetico.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CosmeticoService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<CosmeticoModel> getAll(){
        return bancoDeDados.findAll();
    }
    public CosmeticoModel getById(int id){
        List<CosmeticoModel> cosmeticoModels = bancoDeDados.findAll();
        for (CosmeticoModel cosmetico : cosmeticoModels){
            if (cosmetico.getId() == id){
                return cosmetico;
            }
        }
        return null;
    }

    public String save(CosmeticoModel cosmetico){
        return bancoDeDados.save(cosmetico);
    }
    public String delete(int id){
        return bancoDeDados.delete(id);
    }
}
