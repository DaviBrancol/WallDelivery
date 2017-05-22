package view;

import model.Response;
import controller.IngredientController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Ingredient;

public class IngreTable extends JTable implements TableManager {
    
    public IngreTable() {
        IngreTable table = this;
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    int selected = table.getSelectedRow();
                    if(IngredientController.isAvailable(selected)) {
                        String[] options = {"Atualizar", "Deletar"};
                        int option = JOptionPane.showOptionDialog(null,"O que deseja fazer com o ingrediente"
                                + "\nNome: " + table.getValueAt(table.getSelectedRow(), 0)
                                + "\nCalorias: " + table.getValueAt(table.getSelectedRow(), 1),
                                "Ingrediente", 0,JOptionPane.QUESTION_MESSAGE,null,options,null);
                        Response<Ingredient> resp = new Response(false);
                        switch (option) {
                            case 0:
                                String name = JOptionPane.showInputDialog("Digite o novo nome do ingrediente");
                                String calories = JOptionPane.showInputDialog("Digite as calorias do ingrediente");
                                resp = IngredientController.updateIngredient(name, calories, selected);
                                break;
                            case 1:
                                resp = IngredientController.deleteIngredient(selected);
                                break;
                            default:
                                break;
                        }
                        if(resp.success) {
                            table.clean();
                            table.populate();
                        }
                    }
                }
            }
        });;
    }
    
    @Override
    public void populate() {
        ArrayList<Ingredient> ingredients = IngredientController.getAllIngredients();
        DefaultTableModel model = (DefaultTableModel)this.getModel();
        model.setRowCount(ingredients.size());
        for (int i = 0; i < ingredients.size(); i++) {
            Ingredient ingredient = ingredients.get(i);
            this.getModel().setValueAt(ingredient.getName(), i, 0);
            this.getModel().setValueAt(ingredient.getCalories() + "", i, 1);
        }
    }
    @Override
    public void clean() {
        for (int i = 0; i < this.getRowCount(); i++) {
            this.getModel().setValueAt("", i, 0);
            this.getModel().setValueAt("", i, 1);
        }  
    }
}
