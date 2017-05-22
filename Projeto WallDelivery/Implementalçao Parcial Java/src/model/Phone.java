package model;

import Exceptions.PhoneFormatException;
import Exceptions.SizeException;
import java.io.Serializable;

public class Phone implements Serializable{
    
    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        this.ddd = ddd;
        this.number = number;
    }
    
    public Phone() {
        this.ddd = "";
        this.number = "";
    }
    
    public void validatePhone(String number) {
        if(number.length() == 0) {
            throw new SizeException("Telefone");
        } else {
            if(number.length() != 14) {
                throw new PhoneFormatException();
            }
            if (number.charAt(3) != ' ' || number.charAt(9) != '-' ) {
                throw new PhoneFormatException();
            }
            try {
                for (int i = 0; i < 3; i++) {
                    ddd += Integer.parseInt(number.substring(i,i+1)) + "";
                }
                for (int i = 4; i < 14; i++) {
                    if(i != 9) {
                        this.number += Integer.parseInt(number.substring(i,i+1)) + "";
                    }
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                throw new PhoneFormatException();
            }
        }
        
    
    }

    @Override
    public String toString() {
        return ddd + " " + number.substring(0, 5) + "-" + number.substring(5, 9);
    }
    
    
}
