package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Dish implements Serializable{
    
    private String name;
    private String description;
    private double price;
    private ArrayList<Ingredient> ingredients;

    public Dish(String name, String description, double price, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ingredients = ingredients;
    }
    
    
    
}
