package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Ameliyathane", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))

public class Ameliyathane {

    @Column(unique = true)
    private String id;

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }
}
