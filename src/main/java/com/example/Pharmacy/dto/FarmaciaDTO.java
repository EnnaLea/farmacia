package com.example.Pharmacy.dto;

import com.example.Pharmacy.model.Farmacista;
import com.example.Pharmacy.model.Farmaco;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FarmaciaDTO {
    private Long id;

    private Farmacista farmacista;

    private Farmaco farmaco;

    private String name;

    private String address;

    private String city;

    private String mail;

    private String description;
}
