package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;


import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    String nombreEmpresa;
    String direccionEmpresa;
    int telefonoEmpresa;
    int nitEmpresa;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("AndesBPO", "Km 2 Via El Tambp", 5537866, 900326590);

        System.out.println(empresa1.getNombreEmpresa());
        empresa1.setNombreEmpresa("AndesBPO ver2");
        System.out.println(empresa1.getNombreEmpresa());

        System.out.println(empresa1.getDireccionEmpresa());
        empresa1.setDireccionEmpresa("Km 4 ");
        System.out.println(empresa1.getDireccionEmpresa());

        System.out.println(empresa1.getTelefonoEmpresa());
        empresa1.setTelefonoEmpresa(5538888);
        System.out.println(empresa1.getTelefonoEmpresa());

        System.out.println(empresa1.getNitEmpresa());
        empresa1.setNitEmpresa(966666666);
        System.out.println(empresa1.getNitEmpresa());
    }
}




