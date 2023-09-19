package com.example.Pharmacy.dto;

import com.example.Pharmacy.model.Farmacista;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FarmacoDTO {
    private Long id;
    private String nome;

    private Farmacista farmacista;

    private String prescrizione;

    private String scadenza;
}
