package com.example.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.CartNotFoundException;
import com.example.model.Cart;
import com.example.repository.CartRepository;
import com.example.repository.UserRepository;
import com.example.service.CartService;

@Service
public class CartServiceImpl implements CartService
{
	    @Autowired
	    private CartRepository cartRepository;
	    @Autowired
	    UserRepository userRepository;

	    @Override

	    public Cart saveCart(int reg_id, Cart cart) 
	    {
	        Optional<Cart> cart1 = cartRepository.findById(cart.getId());
	        cart.setRegister(userRepository.getById(reg_id));
	        return cartRepository.save(cart);
	    }
	    
	    @Override
	    public Optional<Cart> showallcartbyregid(int reg_id) 
	    {
         return  cartRepository.findById(reg_id);

	    }

	    @Override
	    public Cart deletebyid(int id) 
	    {
	        Optional<Cart> cart2=cartRepository.findById(id);
	        if(cart2.isPresent())
	        {
	            cartRepository.deleteById(id);
	        }
	        else
	        {
	            throw new CartNotFoundException("vehivle is not existing");
	        }
	        return cart2.get();
	    }

	    @Override
	    public Cart deleteallbyid(int reg_id) {
	        List<Cart> cart1=cartRepository.findAllById(reg_id);
	    if(cart1==null){
	        throw new CartNotFoundException("vehivle is not existing");
	    }
	  cartRepository.deleteAll(cart1);
	        return null;
	    }
       
	    @Override
        public List<Cart> showallcart() {
	        return cartRepository.findAll();
	    }

	
}
