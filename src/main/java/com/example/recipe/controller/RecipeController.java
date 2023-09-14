package com.example.recipe.controller;

import com.example.recipe.domain.RecipeService;
import com.example.recipe.domain.models.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService menuService;

    public RecipeController(RecipeService recipeService) {
        this.menuService = recipeService;
    }

    @GetMapping
    List<Recipe> getAllRecipes() {
        return menuService.getAllRecipes();
    }

    @GetMapping("/{id}")
    Recipe getRecipe(@PathVariable int id) {
        return menuService.getRecipe(id);
    }
}
