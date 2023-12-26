package com.example.service;

import java.util.List;

import com.example.model.OrderItems;

public interface OrderItemsService 
{
	 OrderItems saveOrderItems(OrderItems orderItems);

     List<OrderItems> getallorderitemsCart();
}
