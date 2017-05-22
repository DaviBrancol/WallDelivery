package model;

import Exceptions.EmailInvalidException;
import Exceptions.SizeException;
import java.io.Serializable;

public class Email implements Serializable{
    
    private String email;
    
    public Email(String email) {
        this.email = email;
    }
    
    public Email() {
        this.email = "";
    }

    public String getEmail() {
        return email;
    }
    
    public void validateEmail(String email) {
        if(email.length() == 0) {
            throw new SizeException("E-mail");
        } else if(!email.contains("@") && !email.contains(".")) {
            throw new EmailInvalidException();
        } else {
            this.email = email;
        }
        
    }

    @Override
    public String toString() {
        return email;
    }
    
}
