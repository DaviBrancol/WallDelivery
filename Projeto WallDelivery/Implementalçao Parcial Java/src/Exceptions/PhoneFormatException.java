package Exceptions;

public class PhoneFormatException extends RuntimeException {

    public PhoneFormatException() {
         super("O campo Telefone deve conter o seguinte formato:\n000 00000-0000");
    }
}
