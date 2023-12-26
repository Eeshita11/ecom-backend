package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Cart;
import com.example.repository.CartRepository;
import com.example.service.CartService;
import com.example.service.UserService;

@RestController
public class CartController 
{
	@Autowired
    private CartRepository cartRepository ;

    @Autowired
    private CartService cartService ;


    @Autowired
    private UserService userService;

    @PostMapping(value="/register/{reg_id}")
    public ResponseEntity<Cart> saveCart( @PathVariable int  reg_id, @RequestBody Cart cart)
    {
        return new ResponseEntity<Cart>(cartService.saveCart(reg_id,cart), HttpStatus.CREATED);
    }
    
    @GetMapping(value="/showallcart")
    public ResponseEntity<List<Cart>> showallcart()
    {
        List<Cart> allCart=cartService.showallcart();
        return  new ResponseEntity<List<Cart>>(allCart,HttpStatus.OK);
    }
    
    @DeleteMapping(value="/deletebyallbyid/{reg_id}")
    public  Cart  deleteallbyid(@PathVariable int reg_id) 
    {
        return  cartService.deleteallbyid(reg_id);
    }


    @DeleteMapping(value="/deletebyid/{id}")
    public ResponseEntity<String> deletebyid( @PathVariable int id) 
    {
        cartService.deletebyid(id);
        String msg = " Cart with number: Deleted Successfully";
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
