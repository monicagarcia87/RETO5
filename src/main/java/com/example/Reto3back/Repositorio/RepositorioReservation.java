package com.example.Reto3back.Repositorio;


import com.example.Reto3back.Entidad.Client;
import com.example.Reto3back.Entidad.Reservation;
import com.example.Reto3back.Interfaz.InterfaceReservation;
import com.example.Reto3back.Reservas.ContadorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioReservation {
@Autowired
private InterfaceReservation crud4;

    public List<Reservation> getAll(){
        return (List<Reservation>) crud4.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservation save(Reservation reservation){
        return crud4.save(reservation);
    }
    public void delete(Reservation reservation){
        crud4.delete(reservation);
    }

    public List<Reservation> ReservationStatus(String status) {
        return crud4.findAllByStatus(status);
    }

    public List<Reservation> ReservacionTiempoRepositorio(Date a, Date b) {
        return crud4.findAllByStartDateAfterAndStartDateBefore(a, b);
    }

    public List<ContadorClient> getClientesRepositorio() {
        List<ContadorClient> res = new ArrayList<>();
        List<Object[]> report = crud4.countTotalReservationsByClient();
        for (int i = 0; i < report.size(); i++) {
            res.add(new ContadorClient((Long) report.get(i)[1], (Client) report.get(i)[0]));
        }
        return res;
    }
}
