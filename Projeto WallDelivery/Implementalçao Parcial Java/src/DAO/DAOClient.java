package DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Client;
import model.Response;

public class DAOClient implements DataAcessObject<Client> {
    
    private ArrayList<Client> clients;
    
    private DAOClient() {
        clients = new ArrayList<>();
    }
    
    public static DAOClient getInstance() {
        return DAOClientHolder.INSTANCE;
    }
    
    private static class DAOClientHolder {
        private static final DAOClient INSTANCE = new DAOClient();
    }
    
    @Override
    public void addObject(Client newClient) {
        clients.add(newClient);
        this.saveObject();
    }
    
    @Override
    public Response removeObject(int index) {
        clients.remove(index);
        this.saveObject();
        return new Response("Cliente removido com sucesso", true);
    }
    @Override
    public Response updateObject(Client newClient, int index) {
        clients.remove(index);
        clients.add(index, newClient);
        this.saveObject();
        return new Response("Cliente atualizado com sucesso", true);
    }
    
    @Override
    public Client getObjectIndex(int index) {
        return clients.get(index);
    }

    @Override
    public boolean isIndexAvailable(int index) {
        if(clients.size() - 1 < index) {
            return false;
        } else {
            return true;
        }
    }
        
    @Override
    public void saveObject() {
        File file = new File("clients.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clients);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException ex) {
            System.out.println("Problema no fluxo de saída!");
        }
    }
    
    @Override
    public ArrayList<Client> loadObject() {
        File file = new File("clients.txt");
        if(clients.isEmpty()) {
            try {
                if(file.length() > 0){
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    clients = (ArrayList<Client>)ois.readObject();

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
            return clients;
        } else {
            return clients;   
        }
    }
    
}

