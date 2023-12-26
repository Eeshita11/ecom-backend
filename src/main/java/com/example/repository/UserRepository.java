package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Register;

@Repository
public interface UserRepository  extends JpaRepository<Register,Integer> 
{

	 public Optional<Register> findByemailAndPassword(String email, String password);

	Register findByemail(String email);

}
