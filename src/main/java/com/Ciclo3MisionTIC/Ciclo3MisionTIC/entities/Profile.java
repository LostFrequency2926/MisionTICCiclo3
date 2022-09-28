package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_profile;

    @Column(name = "image")
    private String image;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "updatedAt", unique = true)
    private LocalDate updatedAt;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    @Column(name = "auth0Id", unique = true)
    private String auth0Id;

    @Column(name = "administrador")
    private boolean administrador;

    public Profile(String image, String name, String email, LocalDate updatedAt, LocalDate createdAt, String auth0Id, boolean administrador) {
        this.id_profile = id_profile;
        this.image = image;
        this.name = name;
        this.email = email;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.auth0Id = auth0Id;
        this.administrador = administrador;
    }
    public Profile() {}

    public long getId_profile() {
        return id_profile;
    }

    public void setId_profile(long id_profile) {
        this.id_profile = id_profile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAuth0Id() {
        return auth0Id;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
