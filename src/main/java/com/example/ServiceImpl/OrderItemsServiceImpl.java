package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.OrderItems;
import com.example.repository.OrderItemsRepository;
import com.example.service.OrderItemsService;

@Service
public class OrderItemsServiceImpl implements OrderItemsService
{
	 @Autowired
	 private OrderItemsRepository orderItemsRepository;


	@Override
	public OrderItems saveOrderItems(OrderItems orderItems) 
	{
		return orderItemsRepository.save(orderItems);
	}

	@Override
	public List<OrderItems> getallorderitemsCart() 
	{
		 return orderItemsRepository.findAll();
	}

}
