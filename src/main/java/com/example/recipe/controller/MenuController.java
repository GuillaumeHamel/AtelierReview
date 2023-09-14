package com.example.recipe.controller;

import com.example.recipe.domain.MenuService;
import com.example.recipe.domain.models.Ingredient;
import com.example.recipe.domain.models.Menu;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    Menu createMenu(@RequestBody Menu menu) {
        return menuService.saveMenu(menu);
    }

    @GetMapping("/{id}")
    Menu getMenu(@PathVariable int id) {
        return menuService.getMenu(id);
    }

    @GetMapping("/{id}/grocery-list")
    List<Ingredient> createGroceryList(@PathVariable int id) {
        return menuService.createGroceryList(id);
    }
}
