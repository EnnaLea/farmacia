package com.example.Pharmacy.converter;

import com.example.Pharmacy.dto.FarmaciaDTO;
import com.example.Pharmacy.dto.FarmacoDTO;
import com.example.Pharmacy.model.Farmaco;
import jakarta.persistence.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FarmacoConverter {

    public Farmaco toEntity(FarmacoDTO farmacoDTO){
        Farmaco farmaco = Farmaco.builder()
                .id(farmacoDTO.getId())
                .nome(farmacoDTO.getNome())
                .farmacista(farmacoDTO.getFarmacista())
                .prescrizione(farmacoDTO.getPrescrizione())
                .scadenza(farmacoDTO.getScadenza())
                .build();
        return farmaco;
    }

    public FarmacoDTO toDto(Farmaco farmaco){
        FarmacoDTO farmacoDTO = FarmacoDTO.builder()
                .id(farmaco.getId())
                .farmacista(farmaco.getFarmacista())
                .prescrizione(farmaco.getPrescrizione())
                .scadenza(farmaco.getScadenza())
                .build();
        return farmacoDTO;
    }

    public List<Farmaco> toEntityList(List<FarmacoDTO> farmacoDTOList){
        List<Farmaco> farmacoList = new ArrayList<Farmaco>();
        for(FarmacoDTO dto: farmacoDTOList){
            Farmaco farmaco = toEntity(dto);
            farmacoList.add(farmaco);
        }

        return farmacoList;
    }

    public List<FarmacoDTO> toDtoList(List<Farmaco> farmacoList){
        List<FarmacoDTO> farmacoDTOList = new ArrayList<FarmacoDTO>();
        for(Farmaco farmaco: farmacoList){
            FarmacoDTO farmacoDTO = toDto(farmaco);
            farmacoDTOList.add(farmacoDTO);
        }
        return farmacoDTOList;
    }
}
