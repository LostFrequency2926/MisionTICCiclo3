package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;
import java.time.LocalDate;

public class empleadoService {
    Empleado empleado1;
    Empleado empleado2;
    listaUsuarios listadeUsuarios;


    public empleadoService(){

        this.empleado1 = new Empleado(1, "mail", "nan", "nan", "Andes", "nan",LocalDate.now(),LocalDate.now() );
        this.empleado2 = new Empleado(1, "mail", "nan", "nan", "Andes", "nan",LocalDate.now(),LocalDate.now() );

        this.listadeUsuarios = new listaUsuarios("Prueba de lista de empleados");

        listadeUsuarios.addEmpleado(empleado1);
        listadeUsuarios.addEmpleado(empleado2);
    }

    public listaUsuarios getListaUsuarios(){
        return this.listadeUsuarios;
    }
}