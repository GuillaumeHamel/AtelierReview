package com.example.recipe.domain.models;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.example.recipe.domain.models.Unit.*;
import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void createGroceryList_shouldCreateList() {
        // Given
        var toto = new Recipe("Recipe 1", List.of(
                new Ingredient(100, GRAM, "Sugar"),
                new Ingredient(200, CENTILITER, "Milk")));

        var tata = new Recipe("Recipe 2", List.of(
                new Ingredient(200, GRAM, "Sugar"),
                new Ingredient(1, TABLESPOON, "Vanilla")
        ));

        var test = new Menu(List.of(toto, tata));

        // When
        var list = test.process();

        // Then
        var list2 = List.of(
                new Ingredient(300, GRAM, "Sugar"),
                new Ingredient(200, CENTILITER, "Milk"),
                new Ingredient(1, TABLESPOON, "Vanilla"));

        assertTrue(list2.size() == list.size() && list2.containsAll(list));
    }

    @Test
    void createGroceryList_shouldReturnEmptyList() {
        // Given
        var emptyMenu = new Menu(List.of());

        // When
        var groceryList = emptyMenu.process();

        // Then
        assertTrue(groceryList.isEmpty());
    }
}
