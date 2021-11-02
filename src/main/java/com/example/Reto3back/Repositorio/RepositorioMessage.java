package com.example.Reto3back.Repositorio;


import com.example.Reto3back.Entidad.Message;
import com.example.Reto3back.Interfaz.InterfaceMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioMessage {

@Autowired
private InterfaceMessage crud3;
    public List<Message> getAll(){
        return (List<Message>) crud3.findAll();
    }
    public Optional<Message> getMessage(int id){
        return crud3.findById(id);
    }

    public Message save(Message message){
        return crud3.save(message);
    }
    public void delete(Message message){
        crud3.delete(message);
    }


}
