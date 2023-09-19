package com.example.Pharmacy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_farmacista", referencedColumnName = "id")
    private Farmacista farmacista;

    @ManyToOne
    @JoinColumn(name = "id_farmaco", referencedColumnName = "id")
    private Farmaco farmaco;

    private String name;

    private String address;

    private String city;

    private String mail;

    private String description;
}
