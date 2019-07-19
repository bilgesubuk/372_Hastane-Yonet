package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Ameliyathane", uniqueConstraints = @UniqueConstraint(name = "username_uc"
        , columnNames = "id"))

public class Ameliyathane {
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
}
