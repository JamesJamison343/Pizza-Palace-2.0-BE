package com.pizzapalace2.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pizzapalace2.model.User;

@Repository
public interface UserRepo {
	
	public List<User> findAll();
	public User findByUserId(int userId);
	public User findByUsername(String username);

}
