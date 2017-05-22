package Exceptions;

public class CPFSizeException extends RuntimeException{

    public CPFSizeException() {
        super("O campo CPF deve conter 11 dígitos");
    }
    
}
