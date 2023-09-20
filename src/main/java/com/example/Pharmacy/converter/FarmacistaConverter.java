package com.example.Pharmacy.converter;

import com.example.Pharmacy.dto.FarmacistaDTO;
import com.example.Pharmacy.model.Farmacista;
import org.springframework.stereotype.Component;

@Component
public class FarmacistaConverter {

    public Farmacista toEntity(FarmacistaDTO farmacistaDTO){
        return Farmacista.builder()
                .id(farmacistaDTO.getId())
                .farmacia(farmacistaDTO.getFarmacia())
                .nome(farmacistaDTO.getNome())
                .cognome(farmacistaDTO.getCognome())
                .partitaIva(farmacistaDTO.getPartitaIva())
                .number(farmacistaDTO.getNumber())
                .username(farmacistaDTO.getUsername())
                .password(farmacistaDTO.getPassword())
                .build();
    }

    public FarmacistaDTO toDto(Farmacista farmacista){
        return FarmacistaDTO.builder()
                .id(farmacista.getId())
                .farmacia(farmacista.getFarmacia())
                .nome(farmacista.getNome())
                .cognome(farmacista.getCognome())
                .partitaIva(farmacista.getPartitaIva())
                .number(farmacista.getNumber())
                .username(farmacista.getUsername())
                .password(farmacista.getPassword())
                .build();
    }
}
