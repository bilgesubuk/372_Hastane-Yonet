package com.example.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "Yonetici", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))

public class Yonetici {

    @Column(unique = true)
    private String id;

    private String password;
    private String isim;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

