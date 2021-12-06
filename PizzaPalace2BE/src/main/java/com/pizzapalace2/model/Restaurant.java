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
@Table(name = "restaurants")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Restaurant {
	
	@Id
    @Column(name = "restaurant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantId;

    @Column(name = "name")
    private String name; 
    
    @Column(name = "location")
    private String location; 
    
    @Column(name = "type")
    private String type; 
    
    @Column(name = "description")
    private String description;

	public Restaurant(String name, String location, String type, String description) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.description = description;
	} 
}
