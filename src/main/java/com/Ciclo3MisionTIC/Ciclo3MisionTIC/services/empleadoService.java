package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;

public class empleadoService {
    Empleado empleado1;
    Empleado empleado2;
    listaUsuarios listadeUsuarios;


    public empleadoService(){

        this.empleado1 = new Empleado("Daniel", "dafemure.180@gmail.com", 900326590, "operario");
        this.empleado2 = new Empleado("Karen", "ksnm.180@gmail.com", 900326590, "operario");

        this.listadeUsuarios = new listaUsuarios("Prueba de lista de empleados");

        listadeUsuarios.addEmpleado(empleado1);
        listadeUsuarios.addEmpleado(empleado2);
    }

    public listaUsuarios getListaUsuarios(){
        return this.listadeUsuarios;
    }
}


