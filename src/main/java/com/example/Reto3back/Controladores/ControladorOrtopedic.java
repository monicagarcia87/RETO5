package com.example.Reto3back.Controladores;

import com.example.Reto3back.Entidad.Ortopedic;
import com.example.Reto3back.Servicios.ServiciosOrtopedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Ortopedic")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ControladorOrtopedic {

     @Autowired
     private ServiciosOrtopedic servicio;
    @GetMapping("/all")
    public List<Ortopedic> getOrtopedics(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Ortopedic> getOrtopedic(@PathVariable("id") int ortopedicId) {
        return servicio.getOrtopedic(ortopedicId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortopedic save(@RequestBody Ortopedic ortopedic) {
        return servicio.save(ortopedic);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortopedic update(@RequestBody Ortopedic ortopedic) {
        return servicio.update(ortopedic);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int ortopedicId) {
        return servicio.deleteOrtopedic(ortopedicId);
    }
}
