package com.example.pizza.service;


import com.example.pizza.model.pizza.Pizzas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PizzaService {
    List<Pizzas> getListPizza();

    Pizzas getPizza(Long idPizza) throws Exception;
}
