package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaEmpresas;

import java.time.LocalDate;

public class empresaService {

    Empresa empresa1;
    Empresa empresa2;
    listaEmpresas listadeEmpresas;

    public empresaService(){

        this.empresa1 = new Empresa(1, "Andes", "900326590", "5537866", "km 2 Via el tambo", "Daniel", "none", LocalDate.now(),LocalDate.now());

        this.empresa2 = new Empresa(1, "Andes", "900326590", "5537866", "km 2 Via el tambo", "Daniel", "none", LocalDate.now(),LocalDate.now());

        this.listadeEmpresas = new listaEmpresas("Prueba de lista de empresas");

        listadeEmpresas.addEmpresa(empresa1);
        listadeEmpresas.addEmpresa(empresa2);
    }

    public listaEmpresas getListaEmpresas(){
        return this.listadeEmpresas;
    }
}
