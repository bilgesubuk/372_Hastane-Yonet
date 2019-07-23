package com.example.demo.model;

import javax.persistence.*;
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
}
