package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultarListaUsuarios {

    empleadoService service;

    public ConsultarListaUsuarios(){
        this.service = new empleadoService();
    }


    @GetMapping("/users")
    public listaUsuarios ConsultarListaUsuarios(){
        return this.service.getListaUsuarios();
    }

}
