package com.pizzapalace2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzapalace2.model.User;
import com.pizzapalace2.repository.UserRepo;

@Service
public class UserService {
	
	private UserRepo uRepo;
	
	@Autowired
	public UserService(UserRepo uRepo) {
		super();
		this.uRepo = uRepo;
	}
	
	public void addUser(User person) {
		uRepo.save(person);
	}
	
	public List<User> getAll() {
		return uRepo.findAll();
	}
	
	public User getByUserId(int num) {
		return uRepo.findByUserId(num);
	}
	
	public User getByUserName(String user) {
		return uRepo.findByUsername(user);
	}

}
