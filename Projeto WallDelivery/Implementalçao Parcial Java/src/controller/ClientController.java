package controller;

import Builder.ClientBuilder;
import DAO.DAOClient;
import java.util.ArrayList;
import model.Client;
import model.Response;

public class ClientController {
    
    public static Response registerClient(String name, String emailString, String cpfString, String phoneString, 
                                          String address, String complement, String cepString, String reference) {
        Response<Client> resp = ClientBuilder.createClient(name, emailString, cpfString, phoneString, address, complement, cepString, reference);
        if(resp.success) {
            DAOClient.getInstance().addObject(resp.object);
        }
        return resp;
    }
    
    public static ArrayList<Client> getAllClients() {
        return DAOClient.getInstance().loadObject();
    }
    public static Response deleteClient(int index) {
        return DAOClient.getInstance().removeObject(index);
    }
    public static Client getClient(int index) {
        return DAOClient.getInstance().getObjectIndex(index);
    }
    public static boolean isAvailable(int index) {
        return DAOClient.getInstance().isIndexAvailable(index);
    }
    
    
}
