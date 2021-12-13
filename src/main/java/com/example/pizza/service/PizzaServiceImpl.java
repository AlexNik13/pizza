package com.example.pizza.service;

import com.example.pizza.model.pizza.Pizzas;
import com.example.pizza.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService{

        private final PizzaRepository pizzaRepository;

    public PizzaServiceImpl(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }


    @Override
    public List<Pizzas> getListPizza() {

        return pizzaRepository.findAll();
    }

    @Override
    public Pizzas getPizza(Long idPizza) throws Exception{
        Pizzas pizzas =  pizzaRepository.findById (idPizza).orElseThrow(Exception::new);
        return pizzas ;
    }
}
