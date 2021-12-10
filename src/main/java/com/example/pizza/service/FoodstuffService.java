package com.example.pizza.service;

import com.example.pizza.model.ingredient.Foodstuffs;
import com.example.pizza.repository.FoodstuffsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodstuffService {

    private final FoodstuffsRepository foodstuffsRepository;

    public FoodstuffService(FoodstuffsRepository foodstuffsRepository) {
        this.foodstuffsRepository = foodstuffsRepository;
    }

    public List<Foodstuffs> getListFoodstuff(){
        return  foodstuffsRepository.findAll();
    }

    public void addFoodstuff(Foodstuffs foodstuffs) {
       foodstuffsRepository.save( foodstuffs );
    }

    public void addFoodstuff(List<Foodstuffs>  foodstuffsList) {
        foodstuffsRepository.saveAll(foodstuffsList);
    }

    public Foodstuffs getFoodstuff(Long idFoodstuff) throws Exception {
        Foodstuffs foodstuffs = foodstuffsRepository.findById(idFoodstuff).orElseThrow(
                Exception::new
        );
        return foodstuffs;
    }

    public void deleteFoodstuff(Long idFoodstuff) {
        foodstuffsRepository.deleteById(idFoodstuff);
    }
}
