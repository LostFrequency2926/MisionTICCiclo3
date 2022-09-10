package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empleado;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Profile;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaUsuarios;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaPerfiles;

import java.time.LocalDate;

public class perfilesService {

    Profile perfil1;
    Profile perfil2;
    listaPerfiles listaPerfiles;

    public perfilesService(){

        this.perfil1 = new Profile(1, "mail", "nan", "nan",LocalDate.now(),LocalDate.now() );
        this.perfil2 = new Profile(1, "mail", "nan", "nan",LocalDate.now(),LocalDate.now() );

        this.listaPerfiles = new listaPerfiles("Prueba de lista de perfiles");

        listaPerfiles.addPerfil(perfil1);
        listaPerfiles.addPerfil(perfil2);
    }

    public listaPerfiles getListaPerfiles(){
        return this.listaPerfiles;
    }

}
