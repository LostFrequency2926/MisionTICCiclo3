package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import java.util.ArrayList;
import java.util.List;

public class listaEmpresas {

    private String name;
    private List<Empresa> listadeEmpresas;

    public listaEmpresas(String name){
        this.setName(name);
        this.listadeEmpresas = new ArrayList<Empresa>();
    }

    public void addEmpresa(Empresa empresa){

        this.listadeEmpresas.add(empresa);
    }
    public List<Empresa> getListaEmpresas() {

        return this.listadeEmpresas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
