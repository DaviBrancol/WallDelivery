package model;

import java.io.Serializable;

public class Ingredient implements Serializable {
    
    private final String name;
    private final double calories;
    
    public Ingredient(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    
    public Ingredient() {
        name = "";
        calories = 0;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }
    
    
}
