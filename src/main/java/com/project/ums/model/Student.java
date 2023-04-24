package com.project.ums.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter @Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nume;

    private String prenume;

    @ManyToOne
    @JoinColumn(name= "specializare_id")
    private Specializare specializare;
}
