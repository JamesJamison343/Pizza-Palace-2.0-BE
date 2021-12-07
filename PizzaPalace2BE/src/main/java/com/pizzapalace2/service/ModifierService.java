package com.pizzapalace2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzapalace2.model.Modifier;
import com.pizzapalace2.repository.ModifierRepo;

@Service
public class ModifierService {
	
	private ModifierRepo mRepo;
	
	@Autowired
	public ModifierService(ModifierRepo mRepo) {
		super();
		this.mRepo = mRepo;
	}
	
	public void addModifier(Modifier mod) {
		mRepo.save(mod);
	}
	
	public List<Modifier> getAll() {
		return mRepo.findAll();
	}
	
	public List<Modifier> getByName(String name) {
		return mRepo.findByName(name);
	}
	
	public Modifier getByModifierId(int num) {
		return mRepo.findByModifierId(num);
	}
	
	public Modifier getByItemId(int num) {
		return mRepo.findByItemId(num);
	}

}
