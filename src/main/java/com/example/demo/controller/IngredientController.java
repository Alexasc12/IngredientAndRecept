package com.example.demo.controller;

import com.example.demo.model.Ingredient;
import com.example.demo.service.IngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable("id") int id) {
        return ingredientService.getIngredient(id);
    }

    @PostMapping()
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.postIngredient(ingredient);
    }



}
