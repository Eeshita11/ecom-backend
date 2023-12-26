package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Cart;

@Repository
public interface CartRepository  extends JpaRepository<Cart,Integer> 
{
	 List<Cart> findAllById(int reg_id);
}
