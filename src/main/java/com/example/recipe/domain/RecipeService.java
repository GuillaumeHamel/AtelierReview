package com.example.recipe.domain;

import com.example.recipe.data.MockApiRepository;
import com.example.recipe.data.MockApiRepositoryImpl;
import com.example.recipe.domain.models.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    MockApiRepository mockApiRepository = new MockApiRepositoryImpl();

    public List<Recipe> getAllRecipes() {
        return mockApiRepository.getAllRecipes();
    }

    public Recipe getRecipe(int id) {
        return mockApiRepository.getRecipeById(id);
    }

}
