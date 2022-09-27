package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.services.empleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class empleadosControllerV2 {
    empleadoService serviceEmpleado;

    public empleadosControllerV2(empleadoService service){
        this.serviceEmpleado = service;
    }

    @GetMapping("/employeesV2")
    public String Empleados(Model model){
        List<Empleado> Empleados = this.serviceEmpleado.getListaUsuarios();
        model.addAttribute("Empleados", Empleados);
        return "Empleados";
    }

    @GetMapping("/employeesV2/new")
    public String newEmpleado(Model model){
        model.addAttribute(new Empleado());
        return "newEmpleado";
    }
}
