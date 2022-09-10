package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaPerfiles;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.perfilesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class perfilesController {

    perfilesService service;

    public perfilesController(perfilesService service){
        this.service = service;
    }

    @GetMapping("/profiles")
    public List<Profile> ConsultarListaPerfiles(){
        return this.service.getListaPerfiles();
    }

}
