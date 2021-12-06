package com.pizzapalace2.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId; 
	
	@Column(name = "item_name")
	private String itemName;
    
    @Column(name = "price")
    private float price;
    
    @Column(name = "type")
    private String type; 
    
    @Column(name = "description")
    private String description; 
    
    @Column(name = "image")
    private String image;

	public Item(Restaurant restaurantId, float price, String type, String description) {
		super();
		this.restaurantId = restaurantId;
		this.price = price;
		this.type = type;
		this.description = description;
	} 
}
