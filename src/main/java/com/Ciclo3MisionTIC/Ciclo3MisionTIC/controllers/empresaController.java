package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaEmpresas;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empresaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class empresaController {

    empresaService service;

    public empresaController(empresaService service){
        this.service = service;
    }

    @GetMapping("/enterprises")
    public List<Empresa> ConsultarListaEmpresas(){

        return this.service.getListaEmpresas();
    }

}
