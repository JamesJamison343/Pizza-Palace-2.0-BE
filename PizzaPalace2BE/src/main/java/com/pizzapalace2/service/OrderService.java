package com.pizzapalace2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzapalace2.model.Order;
import com.pizzapalace2.repository.OrderRepo;

@Service
public class OrderService {
	
	private OrderRepo oRepo;
	
	@Autowired
	public OrderService(OrderRepo oRepo) {
		super();
		this.oRepo = oRepo;
	}
	
	public void addOrder(Order order) {
		oRepo.save(order);
	}
	
	public List<Order> getAll() {
		return oRepo.findAll();
	}
	
	public List<Order> getByUserId(int num) {
		return oRepo.findByUserId(num);
	}
	
	public Order getByRestaurantId(int num) {
		return oRepo.findByRestaurantId(num);
	}

}
