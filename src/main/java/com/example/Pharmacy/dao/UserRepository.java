package com.example.Pharmacy.dao;

import com.example.Pharmacy.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

   User findByUsernameAndPassword(String username, String password);

   @Query("from User where id= :id")
   User findByIdUser(Long id);
}
