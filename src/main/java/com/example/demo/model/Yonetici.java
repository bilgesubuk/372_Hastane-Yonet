package com.example.demo.model;

import javax.persistence.*;
@Entity
@Table(name = "Yonetici", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))

public class Yonetici {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private String password;
    private String isim;



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

    @ManyToOne
    private Hastane hastane;

    public void setHastane(Hastane hastane) {
        this.hastane = hastane;
    }

    public Hastane getHastane() {
        return hastane;
    }
}

