package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Register;

public interface UserService 
{
	   Register saveUser(Register register);
	   
	   public boolean login(String email, String password);

	   Register updateRegister(Integer reg_id, Register register);

	    List<Register> showallregistration();

	    Optional<Register> getregisterbyid(Integer reg_id);

		

}
