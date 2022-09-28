package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id_transaction;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private float amount;

    @Column(name = "userT")
    private String userT;

    @Column(name = "enterprise")
    private String enterprise;

    @Column(name = "updatedAt")
    private LocalDate updatedAt;

    @Column(name = "createdAt")
    private LocalDate createdAt;


    public Transaction(long id_transaction, String concept, float amount, String userT, String enterprise, LocalDate updatedAt, LocalDate createdAt) {
        this.id_transaction = id_transaction;
        this.concept = concept;
        this.amount = amount;
        this.userT = userT;
        this.enterprise = enterprise;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public Transaction() {

    }

    public long getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(long id_transaction) {
        this.id_transaction = id_transaction;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getUsuario() {
        return userT;
    }

    public void setUsuario(String usuario) {
        this.userT = usuario;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
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
}



