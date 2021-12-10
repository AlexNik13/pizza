package com.example.pizza.repository;

import com.example.pizza.model.ingredient.Foodstuffs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodstuffsRepository extends JpaRepository<Foodstuffs, Long> {
}
