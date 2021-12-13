package com.example.pizza.model.pizza;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Pizzas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double prize;

}
