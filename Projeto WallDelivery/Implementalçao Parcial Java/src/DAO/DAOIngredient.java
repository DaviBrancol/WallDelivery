package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Ingredient;
import model.Response;

public class DAOIngredient implements DataAcessObject<Ingredient>{
    
    private ArrayList<Ingredient> ingredients;
    
    private DAOIngredient() {
        ingredients = new ArrayList<>();
    }
    
    public static DAOIngredient getInstance() {
        return DAOIngredientHolder.INSTANCE;
    }
    
    private static class DAOIngredientHolder {
        private static final DAOIngredient INSTANCE = new DAOIngredient();
    }
    
    @Override
    public void addObject(Ingredient ingredient) {
        ingredients.add(ingredient);
        this.saveObject();
    }

    @Override
    public Response removeObject(int index) {
         ingredients.remove(index);
         System.out.println(ingredients);
         this.saveObject();
         return new Response("Ingrediente removido com sucesso", true);
    }

    @Override
    public Response updateObject(Ingredient ingredient, int index) {
         ingredients.remove(index);
         ingredients.add(index, ingredient);
         this.saveObject();
         return new Response("Ingrediente atualizado com sucesso", true);
    }
    
    @Override
    public Ingredient getObjectIndex(int index) {
        return ingredients.get(index);
    }
    
    @Override
    public boolean isIndexAvailable(int index) {
        if(ingredients.size() - 1 < index) {
            return false;
        } else {
            return true;
        }
    }
    
    @Override
    public void saveObject() {
        File file = new File("ingredients.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ingredients);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Problema no fluxo de saída!");
        }
    }
    
    @Override
    public ArrayList<Ingredient> loadObject() {
        File file = new File("ingredients.txt");
        if(ingredients.isEmpty()) {
            try {
                if(file.length() > 0){
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    ingredients = (ArrayList<Ingredient>)ois.readObject();

                    ois.close();
                    fis.close();
                }
            } catch (FileNotFoundException ex) {
                System.out.println("Arquivo não encontrado!");
            } catch (IOException ex) {
                System.out.println("Problema no fluxo de entrada!");
            } catch (ClassNotFoundException ex) {
                System.out.println("Problema ao criar o objeto pessoa!");
            }
            return ingredients;
        } else {
            return ingredients;   
        }
    }
}
