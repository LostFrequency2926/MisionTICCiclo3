package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Employee")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_empleado;

    @Column(name = "email")
    private String email;

    @Column(name = "profile")
    private String profile;

    @Column(name = "role")
    private String role;

    @Column(name = "enterprise")
    private String enterprise;

    @Column(name = "transactions")
    private String transactions;

    @Column(name = "updatedAt")
    private LocalDate updatedAt;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    //CONSTRUCTOR


    public Empleado(long id_empleado, String email, String profile, String role, String enterprise, String transactions, LocalDate updatedAt, LocalDate createdAt) {
        this.id_empleado = id_empleado;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public Empleado() {

    }

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
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

    }
}



