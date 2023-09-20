package com.example.Pharmacy.dto;

import com.example.Pharmacy.model.Farmacia;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FarmacistaDTO {
    private Long id;

    private Farmacia farmacia;

    private String nome;

    private String cognome;

    private String partitaIva;

    private String number;

    private String username;

    private String password;
}
