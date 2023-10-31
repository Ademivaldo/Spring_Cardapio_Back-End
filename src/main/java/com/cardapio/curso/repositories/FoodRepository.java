package com.cardapio.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cardapio.curso.Food;

public interface FoodRepository extends JpaRepository<Food,Long>{

	
	
}
