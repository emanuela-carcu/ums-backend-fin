package com.project.ums.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "specializare")
@Getter
@Setter
public class Specializare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeSpecializare;

    @ManyToOne
    @JoinColumn(name="facultate_id")
    private Facultate facultate;

}
