package com.pizzapalace2.model;

import java.time.LocalDate;

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
@Table(name = "users")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
	
	@Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "first_name")
    private String firstName; 
    
    @Column(name = "last_name")
    private String lastName; 
    
    @Column(name = "password")
    private String password; 
    
    @Column(name = "username")
    private String username;

	public User(String firstName, String lastName, String password, String username) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.username = username;
	} 
}
