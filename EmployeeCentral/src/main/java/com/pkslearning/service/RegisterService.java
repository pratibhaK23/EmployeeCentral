package com.pkslearning.service;

import com.pkslearning.entity.Register;

public interface RegisterService {

	public Register registerUser(Register newUser);
	public Register login(String email, String password);
}
