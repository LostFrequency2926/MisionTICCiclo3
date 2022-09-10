package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Transaction")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_transaction;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private float amount;

    @Column(name = "user")
    private String user;

    @Column(name = "enterprise")
    private String enterprise;

    @Column(name = "updatedAt")
    private LocalDate updatedAt;

    @Column(name = "createdAt")
    private LocalDate createdAt;



    public MovimientoDinero(long id_transaction, String concept, float amount, String user, String enterprise, LocalDate updatedAt, LocalDate createdAt) {
        this.id_transaction = id_transaction;
        this.concept = concept;
        this.amount = amount;
        this.user = user;
        this.enterprise = enterprise;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    //CONSTRUCTOR sin argumentos para poder castear la clase a una tabla
    public MovimientoDinero() {

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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public static void main(String[] args) {

        MovimientoDinero movimiento1 = new MovimientoDinero(1,"compra sillas",2000000, "Daniel", "AndesBPO", LocalDate.now(),LocalDate.now() );

        System.out.println(movimiento1.getAmount());
        movimiento1.setAmount(500000);
        System.out.println(movimiento1.getAmount());

        System.out.println(movimiento1.getConcept());
        movimiento1.setConcept("Compra refrigerios");
        System.out.println(movimiento1.getConcept());

        System.out.println(movimiento1.getUser());
        movimiento1.setUser("Karen");
        System.out.println(movimiento1.getUser());
    }


}
