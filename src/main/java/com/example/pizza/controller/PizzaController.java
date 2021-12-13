package com.example.pizza.controller;

import com.example.pizza.model.pizza.Pizzas;
import com.example.pizza.service.PizzaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pizza")
public class PizzaController {

    private final PizzaService pizzaService;


    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("")
    public List<Pizzas> getListPizza(){
        return pizzaService.getListPizza();
    }

    @GetMapping("/{idPizza}")
    public Pizzas getPizza(@PathVariable Long idPizza) throws Exception{
        return pizzaService.getPizza(idPizza);
    }

}
