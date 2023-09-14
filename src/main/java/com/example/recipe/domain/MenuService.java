package com.example.recipe.domain;

import com.example.recipe.data.MockApiRepositoryImpl;
import com.example.recipe.domain.models.Ingredient;
import com.example.recipe.domain.models.Menu;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuService {
    MockApiRepositoryImpl mockApiRepository;

    public MenuService(MockApiRepositoryImpl mockApiRepository) {
        this.mockApiRepository = mockApiRepository;
    }

    public Menu saveMenu(Menu menu) {
        return mockApiRepository.saveMenu(menu);
    }

    public Menu getMenu(int id) {
        return mockApiRepository.getMenuById(id);
    }

    public List<Ingredient> createGroceryList(int menuId) {
        return mockApiRepository
                .getMenuById(menuId)
                .process();
    }
}
