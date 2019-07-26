package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "doktor", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))

public class Doktor extends Calisan{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;

    private String alan;

    @JsonBackReference
    @JsonIgnoreProperties
    @OneToMany(mappedBy="doktor", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private Set<Randevu> randevular;

    public Set<Randevu> getRandevular() {
        return randevular;
    }

    public void setRandevular(Set<Randevu> randevular) {
        this.randevular = randevular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }


    @OneToMany(cascade = CascadeType.ALL)
    private Set<Ameliyat> ameliyat;

    public Set<Ameliyat> getAmeliyat() {
        return ameliyat;
    }

    public void setAmeliyat(Set<Ameliyat> ameliyat) {
        this.ameliyat = ameliyat;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Hemsire> hemsire;

    public Set<Hemsire> getHemsire() {
        return hemsire;
    }

    public void setHemsire(Set<Hemsire> hemsire) {
        this.hemsire = hemsire;
    }

/*
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Doktor_Hasta",
            joinColumns = { @JoinColumn(name = "tc") },
            inverseJoinColumns = { @JoinColumn(name = "tc") }
    )
    Set<Hasta> hasta = new HashSet<>();


    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Doktor_Hastalik",
            joinColumns = { @JoinColumn(name = "tc") },
            inverseJoinColumns = { @JoinColumn(name = "ICD10") }
    )
    Set<Hastalik> hastalik = new HashSet<>();
*/

}

