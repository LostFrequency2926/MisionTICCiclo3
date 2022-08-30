package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import java.util.ArrayList;
import java.util.List;


public class listaMovimientos {

    private String name;
    private List<MovimientoDinero> listadeMovimientos;

    public listaMovimientos(String name){
        this.setName(name);
        this.listadeMovimientos = new ArrayList<MovimientoDinero>();
    }

    public void addMovimiento(MovimientoDinero movimiento){

        this.listadeMovimientos.add(movimiento);

    }

    public List<MovimientoDinero> getListaMovimientos(){

        return this.listadeMovimientos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
