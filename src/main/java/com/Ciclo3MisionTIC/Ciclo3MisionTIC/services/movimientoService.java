package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.*;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.repositories.movimientosRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class movimientoService {

    private movimientosRepository repository;

    public movimientoService(movimientosRepository repository){
        this.repository = repository;
    }

    public List<Transaction> getListadeMovimientos(){
        return this.repository.findAll();
    }

    public Transaction createTransaction(Transaction movimiento){
        return this.repository.save(movimiento);
    }

    public void deleteMovement(Long id_movement) {
        this.repository.deleteById(id_movement);
    }

    public void patchMovement(Transaction movimiento,Long id_movement) {
        this.repository.deleteById(id_movement);
        this.repository.save(movimiento);
    }
}
