package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Cart;

public interface CartService 
{
	   Cart saveCart(int reg_id, Cart cart);


	    List<Cart> showallcart();


	    Optional<Cart> showallcartbyregid(int reg_id);


	    Cart deletebyid(int id);


	    Cart deleteallbyid(int reg_id);


}
