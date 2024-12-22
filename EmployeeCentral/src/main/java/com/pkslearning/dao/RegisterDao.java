package com.pkslearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkslearning.entity.Register;

@Repository
public interface RegisterDao extends JpaRepository<Register, Long>{
	Register findByEmailAndPassword(String email, String password);
	
}
