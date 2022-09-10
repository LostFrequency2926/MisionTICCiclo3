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

    @Column(name = "phone")
    private String phone;

    @Column(name = "userp")
    private String userp;

    @Column(name = "updatedAt")
    private LocalDate updatedAt;

    @Column(name = "createdAt")
    private LocalDate createdAt;

    public Profile(long id_profile, String image, String phone, String userp, LocalDate updatedAt, LocalDate createdAt) {
        this.id_profile = id_profile;
        this.image = image;
        this.phone = phone;
        this.userp = userp;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public Profile() {

    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return userp;
    }

    public void setUser(String user) {
        this.userp = userp;
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
