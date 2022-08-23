package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskConsultarEmpresas {

    @GetMapping("/prueba")
    public String TaskListarEmpresas(){
        return "Test de retorno de nombre empresa";
    }

}
