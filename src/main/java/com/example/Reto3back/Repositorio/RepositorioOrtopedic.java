package com.example.Reto3back.Repositorio;

import com.example.Reto3back.Entidad.Ortopedic;
import com.example.Reto3back.Interfaz.InterfaceOrtopedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioOrtopedic {

    @Autowired
    private InterfaceOrtopedic crud;
    public List<Ortopedic> getAll(){
        return (List<Ortopedic>) crud.findAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id){
        return crud.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        return crud.save(ortopedic);
    }
    public void delete(Ortopedic ortopedic){
        crud.delete(ortopedic);
    }


}
