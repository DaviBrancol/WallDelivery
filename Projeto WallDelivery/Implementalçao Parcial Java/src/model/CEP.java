package model;

import Exceptions.SizeException;
import Exceptions.CEPFormatException;
import java.io.Serializable;

public class CEP implements Serializable {
    
    private String prefix;
    private String sufix;

    public CEP(String prefix, String sufix) {
        this.prefix = prefix;
        this.sufix = sufix;
    }
    
    public CEP() {
        this.prefix = "";
        this.sufix = "";
    }
    
      
    public void validateCep(String number) {
        if(number.length() == 0) {
            throw new SizeException("CEP");
        } else {
            if(number.length() != 9) {
                throw new CEPFormatException();
            }
            if (number.charAt(5) != '-') {
                throw new CEPFormatException();
            }
            try {
                for (int i = 0; i < 5; i++) {
                    prefix += Integer.parseInt(number.substring(i,i+1)) + "";
                }
                for (int i = 6; i < 9; i++) {
                    if(i != 9) {
                        sufix += Integer.parseInt(number.substring(i,i+1)) + "";
                    }
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                throw new CEPFormatException();
            }
        }
        
    
    }

    @Override
    public String toString() {
        return prefix + "-" + sufix;
    }
    
    
}
