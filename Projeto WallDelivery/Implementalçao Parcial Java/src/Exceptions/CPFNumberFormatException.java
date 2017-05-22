package Exceptions;

public class CPFNumberFormatException extends RuntimeException{

    public CPFNumberFormatException(String msg) {
        super(msg);
    }
    public CPFNumberFormatException() {
        super("O Campo CPF deve conter somente números");
    }
}
