package com.example.demo.model;

import javax.persistence.*;


@Entity
@Table(name = "Hemsire", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))
public class Hemsire {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    private Doktor doktor;

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Doktor getDoktor() {
        return doktor;
    }
}


