package com.example.pizza.controller;


import com.example.pizza.model.ingredient.Foodstuffs;
import com.example.pizza.service.FoodstuffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/foodstuff")
public class FoodstuffsController {

    private final FoodstuffService foodstuffService;

    public FoodstuffsController(FoodstuffService foodstuffService) {
        this.foodstuffService = foodstuffService;
    }

    @GetMapping("/food")
    public List<Foodstuffs> getFoodstuff(){
        return  foodstuffService.getListFoodstuff();
    }

    @GetMapping("/food/{idFoodstuff}")
    public Foodstuffs getFoodstuff(@PathVariable Long idFoodstuff) throws Exception {
        Foodstuffs stuff = foodstuffService.getFoodstuff(idFoodstuff);
        return  stuff;
    }

    @DeleteMapping("/food/delete/{idFoodstuff}")
    public void deleteFoodstuff(@PathVariable Long idFoodstuff){
        foodstuffService.deleteFoodstuff(idFoodstuff);
    }

    @PostMapping("/addfoodstuff")
    public void addFoodstuff(@RequestBody Foodstuffs foodstuffs){
        foodstuffService.addFoodstuff(foodstuffs);
    }

    @PostMapping("/importfoodstuffs")
    public void importFoodstuffs(@RequestBody List<Foodstuffs>  foodstuffsList){
        foodstuffService.addFoodstuff(foodstuffsList);
    }
}
