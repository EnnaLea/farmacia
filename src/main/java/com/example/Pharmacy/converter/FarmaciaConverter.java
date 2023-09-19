package com.example.Pharmacy.converter;

import com.example.Pharmacy.dto.FarmaciaDTO;
import com.example.Pharmacy.model.Farmacia;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FarmaciaConverter {

    public Farmacia toEntity(FarmaciaDTO farmaciaDTO){
        return Farmacia.builder()
                .id(farmaciaDTO.getId())
                .name(farmaciaDTO.getName())
                .address(farmaciaDTO.getAddress())
                .city(farmaciaDTO.getCity())
                .mail(farmaciaDTO.getMail())
                .description(farmaciaDTO.getDescription())
                .build();
    }

    public FarmaciaDTO toDto(Farmacia farmacia){
        return FarmaciaDTO.builder()
                .id(farmacia.getId())
                .name(farmacia.getName())
                .address(farmacia.getAddress())
                .city(farmacia.getCity())
                .mail(farmacia.getMail())
                .description(farmacia.getDescription())
                .build();
    }

    public List<Farmacia> toEntityList(List<FarmaciaDTO> farmaciaDTOList){
        List<Farmacia> farmaciaList = new ArrayList<Farmacia>();
        for(FarmaciaDTO dto : farmaciaDTOList){
            Farmacia farmacia = toEntity(dto);
            farmaciaList.add(farmacia);
        }

        return farmaciaList;
    }

    public List<FarmaciaDTO> toDtoList(List<Farmacia>farmaciaList){
        List<FarmaciaDTO>farmaciaDTOList =new ArrayList<FarmaciaDTO>();
        for(Farmacia entity : farmaciaList){
            FarmaciaDTO dto = toDto(entity);
            farmaciaDTOList.add(dto);
        }
        return farmaciaDTOList;
    }
}
