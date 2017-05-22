package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable{
    
    private String name;
    private Email email;
    private CPF cpf;
    private Phone phone;
    private Address address;
    private ArrayList<Order> orders;

    public Client(String name, Email email, CPF cpf, Phone phone, String address, String complement, CEP cep, String reference) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = new Address(address, complement, cep, reference);
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    
    public Address getAddress() {
        return address;
    }
    
    public String getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public CPF getCpf() {
        return cpf;
    }
    
    public Phone getPhone() {
        return phone;
    }
    
    
    
    
}
