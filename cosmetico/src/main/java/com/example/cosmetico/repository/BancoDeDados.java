package com.example.cosmetico.repository;
import com.example.cosmetico.model.CosmeticoModel;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class BancoDeDados {
    List<CosmeticoModel> cosmeticoModels = new ArrayList<>();
    public BancoDeDados(){
        cosmeticoModels.add(new CosmeticoModel(1, "Batom", 17.50));
        cosmeticoModels.add(new CosmeticoModel(2, "Perfume", 199.90));
        cosmeticoModels.add(new CosmeticoModel(3, "Shampoo", 21.99));
        cosmeticoModels.add(new CosmeticoModel(4, "Creme Hidratante Facial", 67.90));
    }
    //aqui é um método que permite visualizar todos os itens na lista
    public List<CosmeticoModel> findAll(){
        return cosmeticoModels;
    }
    public String save(CosmeticoModel cosmeticoModel){
        for (CosmeticoModel cosmeticoModel1: cosmeticoModels){
            if (cosmeticoModel.getId() == cosmeticoModel1.getId()){
                return "Este cosmetico ja foi adicionado";
            }
        }
        cosmeticoModels.add(cosmeticoModel);
        return "Produto " + cosmeticoModel.getNome() + " foi adicionado";
    }

    public String delete(int id){
        for (CosmeticoModel cosmetico: cosmeticoModels){
            if (cosmetico.getId() == id){
                cosmeticoModels.remove(cosmetico);
                return "Produto " + cosmetico.getNome() + " foi removido com sucesso";
            }
        }
        return "Produto não encontrado";
    }

}
