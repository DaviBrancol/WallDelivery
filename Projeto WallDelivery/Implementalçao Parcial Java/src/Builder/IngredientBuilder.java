package Builder;

import DAO.DAOIngredient;
import Exceptions.SizeException;
import model.Ingredient;
import model.Response;

public class IngredientBuilder {
    
    public static Response createIngredient(String name, String caloriesString) {
        try {
            if(name.length() == 0) {
                throw new SizeException("Nome");
            }
            double calories = Double.parseDouble(caloriesString);
            Ingredient newIngredient = new Ingredient(name, calories);
            return new Response<>(newIngredient, "Ingrediente cadastrado com sucesso", true);
        } catch (SizeException e) {
            return new Response<>(null, e.getMessage(), false);
        } catch (NumberFormatException e) {
            return new Response<>(null, "Valor de Caloria Inválido", false);
        }
    }
}
