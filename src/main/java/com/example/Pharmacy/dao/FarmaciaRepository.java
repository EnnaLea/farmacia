package com.example.Pharmacy.dao;

import com.example.Pharmacy.model.Farmacia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaciaRepository extends CrudRepository<Farmacia, Long> {
}
