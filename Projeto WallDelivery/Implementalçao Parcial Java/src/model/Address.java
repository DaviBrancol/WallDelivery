package model;

import java.io.Serializable;

public class Address implements Serializable{
    
    private String street;
    private String complement;
    private CEP cep;
    private String reference;

    public Address(String street, String complement, CEP cep, String reference) {
        this.street = street;
        this.complement = complement;
        this.reference = reference;
        this.cep = cep;
    }
    
}
