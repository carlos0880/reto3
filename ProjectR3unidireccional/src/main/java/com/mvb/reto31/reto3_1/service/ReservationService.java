/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mvb.reto31.reto3_1.service;

import com.mvb.reto31.reto3_1.entity.Reservation;
import com.mvb.reto31.reto3_1.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    public Reservation saveReservationAll(Reservation reservation){
        return repository.save(reservation);
    }

    public List<Reservation> getReservationAll(){
        return repository.findAll();
    }

    public Reservation updateReservation(Reservation reservation){
        Reservation existeReservation=repository.findById(reservation.getIdReservation()).orElse(null);
        existeReservation.setStartDate(reservation.getStartDate());
        existeReservation.setDevolutionDate(reservation.getDevolutionDate());
        return repository.save(existeReservation);
    }

    public String deleteReservation(int id){
        repository.deleteById(id);
        return "Item Removido"+id;
    }
}
