package controller;

import Builder.IngredientBuilder;
import DAO.DAOIngredient;
import java.util.ArrayList;
import model.Ingredient;
import model.Response;

public class IngredientController {
    
    public static Response registerIngredient(String name, String calories) {
        Response<Ingredient> resp = IngredientBuilder.createIngredient(name, calories);
        if(resp.success) {
            DAOIngredient.getInstance().addObject(resp.object);
        }
        return resp;
    }
    
    public static ArrayList<Ingredient> getAllIngredients() {
        return DAOIngredient.getInstance().loadObject();
    }
    public static Response deleteIngredient(int index) {
        return DAOIngredient.getInstance().removeObject(index);
    }
    public static Ingredient getIngredient(int index) {
        return DAOIngredient.getInstance().getObjectIndex(index);
    }
    public static boolean isAvailable(int index) {
        return DAOIngredient.getInstance().isIndexAvailable(index);
    }
    public static Response updateIngredient(String name, String calories, int index) {
        Response<Ingredient> resp = IngredientBuilder.createIngredient(name, calories);
        if(resp.success) {
            DAOIngredient.getInstance().updateObject(resp.object, index);
        }
        return resp;
    }
}
