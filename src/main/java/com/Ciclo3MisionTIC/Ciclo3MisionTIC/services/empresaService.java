package com.Ciclo3MisionTIC.Ciclo3MisionTIC.services;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.Empresa;
import com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities.listaEmpresas;

public class empresaService {

    Empresa empresa1;
    Empresa empresa2;
    listaEmpresas listadeEmpresas;

    public empresaService(){

        this.empresa1 = new Empresa("Andes BPO", "km 2 via 3", 5537866, 900326590);
        this.empresa2 = new Empresa("Ilustrar SAS", "ksnm", 32324324, 999999590);

        this.listadeEmpresas = new listaEmpresas("Prueba de lista de empresas");

        listadeEmpresas.addEmpresa(empresa1);
        listadeEmpresas.addEmpresa(empresa2);
    }

    public listaEmpresas getListaEmpresas(){
        return this.listadeEmpresas;
    }
}
