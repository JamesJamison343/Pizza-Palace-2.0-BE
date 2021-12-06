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
@Table(name = "modifiers")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Modifier {

	@Id
    @Column(name = "modifier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modifierId;

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item itemId; 
    
    @Column(name = "name")
    private String name; 
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "price")
    private float price;

	public Modifier(Item itemId, String name, String description, float price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.description = description;
		this.price = price;
	}
}
