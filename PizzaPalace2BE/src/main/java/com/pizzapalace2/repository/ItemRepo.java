package com.pizzapalace2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizzapalace2.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer>{
	
	public List<Item> findAll();
	public List<Item> findByRestaurantId(int restaurantID);
	public Item findByItemId(int itemId);
	
}
