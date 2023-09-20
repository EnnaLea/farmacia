package com.example.Pharmacy.dao;

import com.example.Pharmacy.model.Farmacista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacistaRepository extends CrudRepository<Farmacista, Long> {

    Farmacista findByUsernameAndPassword(String username, String password);
}
