package com.example.recipe.domain.models;

import java.util.List;

import static java.util.stream.Collectors.*;

public class Menu {
    private List<Recipe> recipes;

    public Menu(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public List<Ingredient> process() {
        return recipes.stream()
                .flatMap(recipe -> recipe.getIngredients().stream())
                .collect(groupingBy(Ingredient::getName,
                        groupingBy(Ingredient::getUnit,
                                summingInt(Ingredient::getQuantity))))
                .entrySet().stream()
                .flatMap(entryByName -> entryByName.getValue().entrySet().stream()
                        .map(entryByUnit -> new Ingredient(entryByUnit.getValue(), entryByUnit.getKey(), entryByName.getKey())))
                .collect(toList());
    }
}
