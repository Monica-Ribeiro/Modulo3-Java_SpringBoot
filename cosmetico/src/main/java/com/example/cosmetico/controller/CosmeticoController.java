package com.example.cosmetico.controller;
import com.example.cosmetico.model.CosmeticoModel;
import com.example.cosmetico.service.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/cosmeticos")
public class CosmeticoController {
    @Autowired
    private CosmeticoService cosmeticoService;
    @GetMapping
    public List<CosmeticoModel> getAll(){
        return cosmeticoService.getAll();
    }
    @GetMapping("/{id}")
    public CosmeticoModel getById(@PathVariable int id){
        return cosmeticoService.getById(id);
    }
    @PostMapping
    public String save(@RequestBody CosmeticoModel cosmetico){
        return cosmeticoService.save(cosmetico);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return cosmeticoService.delete(id);
    }

}
