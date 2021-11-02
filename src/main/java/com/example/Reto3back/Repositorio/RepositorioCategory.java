package com.example.Reto3back.Repositorio;

import com.example.Reto3back.Entidad.Category;
import com.example.Reto3back.Interfaz.InterfaceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class RepositorioCategory {

@Autowired
private InterfaceCategory crud;
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    public Optional<Category> getCategory(int id){
        return crud.findById(id);
    }

    public Category save(Category Category){
        return crud.save(Category);
    }
    public void delete(Category Category){
        crud.delete(Category);
    }
}
