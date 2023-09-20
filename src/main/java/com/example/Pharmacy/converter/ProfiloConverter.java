package com.example.Pharmacy.converter;

import com.example.Pharmacy.dto.ProfiloDTO;
import com.example.Pharmacy.model.Profilo;
import org.springframework.stereotype.Component;

@Component
public class ProfiloConverter {

    public Profilo toEntity(ProfiloDTO profiloDTO){
        return Profilo.builder()
                .id(profiloDTO.getId())
                .name(profiloDTO.getName())
                .user(profiloDTO.getUser())
                .address(profiloDTO.getAddress())
                .birth(profiloDTO.getBirth())
                .build();

    }

    public ProfiloDTO toDto(Profilo profilo){
        return ProfiloDTO.builder()
                .id(profilo.getId())
                .name(profilo.getName())
                .user(profilo.getUser())
                .address(profilo.getAddress())
                .birth(profilo.getBirth())
                .build();
    }
}
