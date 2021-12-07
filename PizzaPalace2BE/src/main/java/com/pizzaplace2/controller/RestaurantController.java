package com.pizzaplace2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizzapalace2.model.Restaurant;
import com.pizzapalace2.service.RestaurantService;

@RestController
@RequestMapping(value = "/pizza")
@CrossOrigin(origins = "*")
public class RestaurantController {
	
	private RestaurantService rServ;
	
	@Autowired
	public RestaurantController(RestaurantService rServ) {
		this.rServ = rServ;
	}
	
	@PostMapping("/restaurant")
	public ResponseEntity<Object> addRestaurant(@RequestBody Restaurant rest) {
		System.out.println("inside the restaurant post mapping");
		//rServ.addRestaurant(rest);
		return new ResponseEntity<>("you added stuff successfully", HttpStatus.OK);
	}
	
	@GetMapping("/stuff")
	public ResponseEntity<List<Restaurant>> getAll() {
		System.out.println("inside the get all mapper thing");
		return new ResponseEntity<List<Restaurant>>(rServ.getAll(), HttpStatus.CREATED);
	}
	
}
