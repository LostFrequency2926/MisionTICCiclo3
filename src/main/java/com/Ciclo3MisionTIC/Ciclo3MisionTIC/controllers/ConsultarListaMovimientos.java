package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaMovimientos;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.movimientoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultarListaMovimientos {
    movimientoService service;

    public ConsultarListaMovimientos(){
        this.service = new movimientoService();
    }

    @GetMapping("/movements")
    public listaMovimientos ConsultarListaMovimientos(){
        return this.service.getListadeMovimientos();
    }

}
