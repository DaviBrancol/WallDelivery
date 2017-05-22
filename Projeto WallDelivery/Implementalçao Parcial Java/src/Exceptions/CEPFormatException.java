package Exceptions;

public class CEPFormatException extends RuntimeException {

    public CEPFormatException() {
         super("O campo CEP deve conter o seguinte formato:\n00000-000");
    }
}
