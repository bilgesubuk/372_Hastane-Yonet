package com.example.demo.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Randevu", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))
public class Randevu {
    @Column(unique = true)
    private String id;
    private Date randevu_tarihi;

    public Date getRandevu_tarihi() {
        return randevu_tarihi;
    }

    public String getId() {
        return id;
    }

    public void setRandevu_tarihi(Date randevu_tarihi) {
        this.randevu_tarihi = randevu_tarihi;
    }

    public void setId(String id) {
        this.id = id;
    }
}
