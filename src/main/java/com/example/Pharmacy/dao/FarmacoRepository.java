package com.example.Pharmacy.dao;

import com.example.Pharmacy.model.Farmaco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepository extends CrudRepository<Farmaco, Long> {
}
