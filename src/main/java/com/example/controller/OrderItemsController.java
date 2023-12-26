package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.OrderItems;
import com.example.repository.OrderItemsRepository;
import com.example.service.OrderItemsService;

@RestController
public class OrderItemsController 
{
	@Autowired
    private OrderItemsService orderItemsService;
	
    @Autowired
    private OrderItemsRepository orderItemsRepository;

    @PostMapping(value="/orderitems")
    public ResponseEntity<OrderItems> saveallorderitems( @RequestBody OrderItems orderItems)
    {
        return new ResponseEntity<OrderItems>(orderItemsService.saveOrderItems(orderItems), HttpStatus.CREATED);
    }

    @GetMapping(value = "/orderitems")
    public ResponseEntity<List<OrderItems>> getallorderitemsCart()
    {
        return new ResponseEntity<List<OrderItems>> (orderItemsService.getallorderitemsCart(), HttpStatus.OK);
    }
	
}
