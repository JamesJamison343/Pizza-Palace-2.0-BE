package com.pizzapalace2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizzapalace2.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{
	
	public List<Order> findAll();
	public List<Order> findByUserId(int userId);
	public Order findByRestaurantId(int restaurantId);

}
