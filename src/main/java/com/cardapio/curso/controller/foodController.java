package com.cardapio.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardapio.curso.Food;
import com.cardapio.curso.food.FoodRequestDTO;
import com.cardapio.curso.food.FoodResponseDTO;
import com.cardapio.curso.repositories.FoodRepository;
	
@RestController
@RequestMapping("food")

public class foodController {
	
	@Autowired
	private FoodRepository repository;
	
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@PostMapping
	public void saveFood(@RequestBody FoodRequestDTO data) {
		Food foodData = new Food(data);
		repository.save(foodData);
		return;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders="*")
	@GetMapping
	public List<FoodResponseDTO> getall() {
		
		List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
		return foodList;
		
	}
}
