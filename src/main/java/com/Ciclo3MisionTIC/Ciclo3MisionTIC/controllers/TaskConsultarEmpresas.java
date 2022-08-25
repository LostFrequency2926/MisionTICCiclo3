package com.Ciclo3MisionTIC.Ciclo3MisionTIC.controllers;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskConsultarEmpresas {

    @GetMapping("/prueba")



    public String TaskListarEmpresas(){

        Empleado empleado1 = new Empleado("Daniel", "dafemure.180@gmail.com", 900326590, "operario");

        return ("Nombre empleado: " + empleado1.getNombreEmpleado() + " Correo Empleado: " + empleado1.getCorreoEmpleado());
    }

}
