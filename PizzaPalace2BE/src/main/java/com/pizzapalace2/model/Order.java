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
@Table(name = "orders")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order {
	
	@Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "user_id")
    private int userId; 
    
    @Column(name = "restaurant_id")
    private float resaurantId; 
    
    @Column(name = "total")
    private float total; 
    
    @Column(name = "address")
    private String address; 
    
    @Column(name = "details")
    private String details;

	public Order(int userId, float resaurantId, float total, String address, String details) {
		super();
		this.userId = userId;
		this.resaurantId = resaurantId;
		this.total = total;
		this.address = address;
		this.details = details;
	}
}
