package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empleadosController {

    empleadoService service;

    public empleadosController(empleadoService service){
        this.service = service;
    }


    @GetMapping("/employees")
    public List<Empleado> ConsultarListaUsuarios(){
        return this.service.getListaUsuarios();
    }

    @PostMapping("/employees")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return this.service.createEmployee(empleado);
    }

}
