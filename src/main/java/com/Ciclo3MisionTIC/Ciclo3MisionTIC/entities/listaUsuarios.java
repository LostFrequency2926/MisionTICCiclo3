package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import java.util.ArrayList;
import java.util.List;

public class listaUsuarios {

    private String name;
    private List<Empleado> listadeUsuarios;

    public listaUsuarios(String name){
        this.setName(name);
        this.listadeUsuarios = new ArrayList<Empleado>();
    }

    public void addEmpleado(Empleado empleado){

        this.listadeUsuarios.add(empleado);
    }

    public List<Empleado> getListaEmpleados() {

        return this.listadeUsuarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
