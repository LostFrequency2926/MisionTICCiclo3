package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaPerfiles;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultarListaPerfiles {

    perfilesService service;

    public ConsultarListaPerfiles(){
        this.service = new perfilesService();
    }

    @GetMapping("/profiles")
    public listaPerfiles ConsultarListaPerfiles(){

        return this.service.getListaPerfiles();
    }

}
