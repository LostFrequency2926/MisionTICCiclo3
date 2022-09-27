package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {

    empleadoService serviceEmpleado;

    public FrontEndController(empleadoService service){
        this.serviceEmpleado = service;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
