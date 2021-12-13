package com.example.pizza.repository;

import com.example.pizza.model.pizza.Pizzas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizzas, Long> {
}
