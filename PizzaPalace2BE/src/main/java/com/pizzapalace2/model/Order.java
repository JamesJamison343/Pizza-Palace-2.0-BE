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

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
    private User userId; 
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="restaurant_id")
    private Restaurant restaurantId; 
    
    @Column(name = "total")
    private float total; 
    
    @Column(name = "address")
    private String address; 
    
    @Column(name = "details")
    private String details;

	public Order(User userId, Restaurant restaurantId, float total, String address, String details) {
		super();
		this.userId = userId;
		this.restaurantId = restaurantId;
		this.total = total;
		this.address = address;
		this.details = details;
	}

}
