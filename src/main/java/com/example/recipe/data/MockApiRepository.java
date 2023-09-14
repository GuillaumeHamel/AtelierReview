package com.example.recipe.data;

import com.example.recipe.domain.models.Menu;
import com.example.recipe.domain.models.Recipe;

import java.util.List;

public interface MockApiRepository {
    List<Recipe> getAllRecipes();
    Recipe getRecipeById(int id);
    Menu saveMenu(Menu menu);
    Menu getMenuById(int menuId);
}
