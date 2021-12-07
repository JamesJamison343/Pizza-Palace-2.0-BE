package com.pizzapalace2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzapalace2.model.Restaurant;
import com.pizzapalace2.repository.RestaurantRepo;

@Service
public class RestaurantService {
	
	private RestaurantRepo rRepo;
	
	@Autowired
	public RestaurantService(RestaurantRepo rRepo) {
		super();
		this.rRepo = rRepo;
	}
	
	public void addRestaurant(Restaurant rest) {
		rRepo.save(rest);
	}
	
	public List<Restaurant> getAll() {
		return rRepo.findAll();
	}
	
	public List<Restaurant> getByRestaurantId(int num) {
		return rRepo.findByRestaurantId(num);
	}
	
	public List<Restaurant> getByName(String name) {
		return rRepo.findByName(name);
	}
	
	public List<Restaurant> getByLocation(String place) {
		return rRepo.findByLocation(place);
	}
	
	public List<Restaurant> getByType(String type) {
		return rRepo.findByType(type);
	}

}
