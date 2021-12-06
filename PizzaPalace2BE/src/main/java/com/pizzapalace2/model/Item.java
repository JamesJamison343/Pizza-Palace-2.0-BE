package com.pizzapalace2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Item {
	
	@Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    @Column(name = "restaurant_id")
    private int restaurantId; 
    
    @Column(name = "price")
    private float price;
    
    @Column(name = "type")
    private String type; 
    
    @Column(name = "description")
    private String description; 
    

	public Item(int restaurantId, float price, String type, String description) {
		super();
		this.restaurantId = restaurantId;
		this.price = price;
		this.type = type;
		this.description = description;
	} 
}