package com.example.demo.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "Sekreter", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))

public class Sekreter {
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

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Randevu> randevu;

    public Set<Randevu> getRandevu() {
        return randevu;
    }

    public void setRandevu(Set<Randevu> randevu) {
        this.randevu = randevu;
    }
}
