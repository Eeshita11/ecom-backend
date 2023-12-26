package com.example.ServiceImpl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Register;
import com.example.repository.UserRepository;
import com.example.service.UserService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService
{
	 @Autowired
     UserRepository userRepository;

	@Override
	public Register saveUser(Register register) 
	{
		 return userRepository.save(register);
	}

	@Override
	public boolean login(String email, String password) 
	{
	   Optional<Register>opt=userRepository.findByemailAndPassword(email,password);
	   if(opt.isPresent())
	   {
	       return true;
	   }
	        return false;
	}

	@Override
	public Register updateRegister(Integer reg_id, Register register) 
	{
		//Register e1= userRepository.findById(reg_id).get();
		
		Register e1 = userRepository.findById(reg_id)
	            .orElseThrow(() -> new EntityNotFoundException("Entity with ID " + reg_id + " not found"));

        if(Objects.nonNull(register.getName())&& !"".equalsIgnoreCase(register.getName()))
        {
            e1.setName(register.getName());
        }

        if(Objects.nonNull(register.getGender())&&!"".equalsIgnoreCase(register.getGender()))
        {
            e1.setGender(register.getGender());
        }
        
        if(Objects.nonNull(register.getDate())&&!"".equalsIgnoreCase(register.getDate()))
        {
            e1.setDate(register.getDate());

        } 
        
        if(Objects.nonNull(register.getDescription())&&!"".equalsIgnoreCase(register.getDescription()))
        {
            e1.setDescription(register.getDescription());
        }
        
        if(Objects.nonNull(register.getPhonenumber())&&!"".equalsIgnoreCase(register.getPhonenumber()))
        {
            e1.setPhonenumber(register.getPhonenumber());
        }
        
        if(Objects.nonNull(register.getAreaofinterest())&&!"".equalsIgnoreCase(register.getAreaofinterest()))
        {
            e1.setAreaofinterest(register.getAreaofinterest());
        }

      return  userRepository.save(e1);
	}

	@Override
	public List<Register> showallregistration() 
	{
		return userRepository.findAll();
	}

	@Override
	public Optional<Register> getregisterbyid(Integer reg_id) 
	{
		 return userRepository.findById(reg_id);
	}

}
