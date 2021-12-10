package com.example.pizza.model.pizza;

import com.example.pizza.model.ingredient.Foodstuffs;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double prize;
}
