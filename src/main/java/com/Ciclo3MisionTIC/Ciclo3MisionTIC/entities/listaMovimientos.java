package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import java.util.ArrayList;
import java.util.List;


public class listaMovimientos {

    private String name;
    private List<Transaction> Transaction;

    public listaMovimientos(String name){
        this.setName(name);
        this.Transaction = new ArrayList<Transaction>();
    }

    public void addMovimiento(Transaction movimiento){

        this.Transaction.add(movimiento);

    }

    public List<Transaction> getListaMovimientos(){

        return this.Transaction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
