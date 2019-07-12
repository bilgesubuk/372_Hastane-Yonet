package com.example.demo.model;
import javax.persistence.*;

@Entity
@Table(name = "Bolum", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "isim"))

public class Bolum {

    @Column(unique = true)
    private String isim;

    public void setIsim(String isim) { this.isim = isim; }
    public String getIsim() { return isim; }

}
