package com.example.recipe.data;

import com.example.recipe.domain.models.Ingredient;
import com.example.recipe.domain.models.Menu;
import com.example.recipe.domain.models.Recipe;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.recipe.domain.models.Unit.GRAM;
import static com.example.recipe.domain.models.Unit.TABLESPOON;

@Repository
public class MockApiRepositoryImpl implements MockApiRepository {
    private final Menu menu = new Menu(List.of(
            new Recipe("Test recipe 1", List.of(new Ingredient(1, TABLESPOON, "Sugar"))),
            new Recipe("Test recipe 2", List.of(new Ingredient(30, GRAM, "Flour"), new Ingredient(2, TABLESPOON, "Sugar")))
    ));

    public Recipe getRecipeById(int id) {
        return menu.getRecipes().get(id);
    }

    public List<Recipe> getAllRecipes() {
        return menu.getRecipes();
    }

    public Menu saveMenu(Menu menu) {
        return menu;
    }

    public Menu getMenuById(int menuId) {
        return menu;
    }
}
