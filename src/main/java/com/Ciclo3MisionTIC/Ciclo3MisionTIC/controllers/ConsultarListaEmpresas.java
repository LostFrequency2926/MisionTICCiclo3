package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaEmpresas;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsultarListaEmpresas {

    empresaService service;

    public ConsultarListaEmpresas(){
        this.service = new empresaService();
    }

    @GetMapping("/enterprises")
    public listaEmpresas ConsultarListaEmpresas(){
        return this.service.getListaEmpresas();
    }

}
