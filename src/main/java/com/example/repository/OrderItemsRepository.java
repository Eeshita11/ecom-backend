package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.OrderItems;

@Repository
public interface OrderItemsRepository  extends JpaRepository<OrderItems,Integer> 
{

}