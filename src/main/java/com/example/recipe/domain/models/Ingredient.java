package com.example.recipe.domain.models;

import java.util.Objects;

public class Ingredient {
    private int quantity;
    private Unit unit;
    private String name;

    public Ingredient(int quantity, Unit unit, String name) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return quantity == that.quantity &&
                unit == that.unit &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, unit, name);
    }
}
