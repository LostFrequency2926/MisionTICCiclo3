package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import org.hibernate.validator.constraints.UniqueElements;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Enterprise")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_empresa;

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "users")
    private String users;

    @Column(name = "transactions")
    private String transactions;

    @Column(name = "updatedAt")
    private LocalDate updatedAt;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    public Empresa() {

    }

    public Empresa(long id_empresa, String name, String document, String phone, String address, String users, String transactions, LocalDate updatedAt, LocalDate createdAt) {
        this.id_empresa = id_empresa;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transactions = transactions;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public static void main(String[] args) {

        Empresa empresa1 = new Empresa(1, "Andes", "900326590", "5537866", "km 2 Via el tambo", "Daniel", "none", LocalDate.now(),LocalDate.now());

        System.out.println(empresa1.getName());
        empresa1.setName("AndesBPO ver2");
        System.out.println(empresa1.getName());

        System.out.println(empresa1.getAddress());
        empresa1.setAddress("Km 4 ");
        System.out.println(empresa1.getAddress());

        System.out.println(empresa1.getPhone());
        empresa1.setPhone("5538888");
        System.out.println(empresa1.getPhone());

        System.out.println(empresa1.getDocument());
        empresa1.setDocument("966666666");
        System.out.println(empresa1.getDocument());
    }
}




