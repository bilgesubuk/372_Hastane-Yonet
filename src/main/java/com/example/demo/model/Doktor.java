package com.example.demo.model;

import javax.persistence.*;

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
}
