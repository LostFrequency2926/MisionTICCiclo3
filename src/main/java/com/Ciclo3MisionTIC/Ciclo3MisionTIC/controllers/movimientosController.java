package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Transaction;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaMovimientos;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class movimientosController {
    movimientoService service;

    public movimientosController(movimientoService service){
        this.service = service;
    }

    @GetMapping("/movements")
    public List<Transaction> ConsultarListaMovimientos(){
        return this.service.getListadeMovimientos();
    }

    @PostMapping("/movements")
    public Transaction createTransaction(@RequestBody Transaction movimiento){
        return this.service.createTransaction(movimiento);
    }
}
