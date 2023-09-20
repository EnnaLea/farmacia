package com.example.Pharmacy.dto;

import com.example.Pharmacy.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfiloDTO {

    private Long id;
    private User user;

    private String name;
    private String address;
    private String birth;
}
