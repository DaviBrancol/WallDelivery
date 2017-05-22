package view;

import model.Response;
import controller.ClientController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Client;

public class ClientTable extends JTable implements TableManager {
    
    public ClientTable() {
        ClientTable table = this;
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    int selected = table.getSelectedRow();
                    if(ClientController.isAvailable(selected)) {
                        String[] options = {"Atualizar", "Deletar"};
                        int option = JOptionPane.showOptionDialog(null,"O que deseja fazer com o ingrediente"
                                + "\nNome: " + table.getValueAt(table.getSelectedRow(), 0)
                                + "\nE-mail: " + table.getValueAt(table.getSelectedRow(), 1)
                                + "\nCPF: " + table.getValueAt(table.getSelectedRow(), 2)
                                + "\nTelefone: " + table.getValueAt(table.getSelectedRow(), 3),
                                "Cliente", 0,JOptionPane.QUESTION_MESSAGE,null,options,null);
                        Response<Client> resp = new Response(false);
                        switch (option) {
                            case 0:
                                //String name = JOptionPane.showInputDialog("Digite o novo nome do ingrediente");
                                //String calories = JOptionPane.showInputDialog("Digite as calorias do ingrediente");
                                //resp = ClientController.updateIngredient(name, calories, selected);
                                break;
                            case 1:
                                resp = ClientController.deleteClient(selected);
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
        ArrayList<Client> clients = ClientController.getAllClients();
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            this.getModel().setValueAt(client.getName(), i, 0);
            this.getModel().setValueAt(client.getEmail(), i, 1);
            this.getModel().setValueAt(client.getCpf(), i, 2);
            this.getModel().setValueAt(client.getPhone(), i, 3);
        }
    }
    @Override
    public void clean() {
        for (int i = 0; i < this.getRowCount(); i++) {
            this.getModel().setValueAt("", i, 0);
            this.getModel().setValueAt("", i, 1);
            this.getModel().setValueAt("", i, 2);
            this.getModel().setValueAt("", i, 3);
        }  
    }
}
