package com.pizzapalace2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzapalace2.model.Item;
import com.pizzapalace2.repository.ItemRepo;

@Service
public class ItemService {
	
	private ItemRepo iRepo;
	
	@Autowired
	public ItemService(ItemRepo iRepo) {
		super();
		this.iRepo = iRepo;
	}
	
	public void addItem(Item item) {
		iRepo.save(item);
	}
	
	public List<Item> getAll() {
		return iRepo.findAll();
	}
	
	public Item getItemById(int itemId) {
		return iRepo.findByItemId(itemId);
	}
	
	public List<Item> getByRestaurantID(int restaurantId) {
		return iRepo.findByRestaurantId(restaurantId);
	}

}
