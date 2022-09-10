package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import java.util.ArrayList;
import java.util.List;

public class listaPerfiles {

    private String name;
    private List<Profile> listaPerfiles;

    public listaPerfiles(String name){
        this.setName(name);
        this.listaPerfiles = new ArrayList<Profile>();
    }

    public void addPerfil(Profile perfil){

        this.listaPerfiles.add(perfil);
    }

    public List<Profile> getListaPerfiles() {

        return this.listaPerfiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
