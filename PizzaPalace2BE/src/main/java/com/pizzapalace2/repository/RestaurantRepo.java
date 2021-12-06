package com.pizzapalace2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizzapalace2.model.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer>{
	
	public List<Restaurant> findAll();
	public List<Restaurant> findByRestaurantId(int restaurantId);
	public List<Restaurant> findByName(String name);
	public List<Restaurant> findByLocation(String location);
	public List<Restaurant> findByType(String type);

}
