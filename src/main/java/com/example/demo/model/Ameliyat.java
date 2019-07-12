package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Ameliyat", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))


public class Ameliyat {

    @Column(unique = true)
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
