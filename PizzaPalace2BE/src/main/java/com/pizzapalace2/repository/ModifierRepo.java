package com.pizzapalace2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pizzapalace2.model.Modifier;

@Repository
public interface ModifierRepo extends JpaRepository<Modifier, Integer>{
	
	public List<Modifier> findAll();
	public List<Modifier> findByName(String name);
	public Modifier findByModifierId(int modifierId);
	public Modifier findByItemId(int itemId);

}
