package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Ameliyat", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))


public class Ameliyat {

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

    @ManyToOne
    private Doktor doktor;

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    @ManyToOne
    private Hasta hasta;

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}
