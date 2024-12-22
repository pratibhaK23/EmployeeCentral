package com.pkslearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkslearning.dao.RegisterDao;
import com.pkslearning.entity.Register;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterDao registerdao;
	
	public Register registerUser(Register newUser)
	{
		System.out.println(newUser);
		return registerdao.save(newUser);
	}
	
	public Register login(String email, String password) {
		Register user = registerdao.findByEmailAndPassword(email,password);
        
        return user; 
    }
}
