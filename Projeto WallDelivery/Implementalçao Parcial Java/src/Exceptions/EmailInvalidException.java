package Exceptions;

public class EmailInvalidException extends RuntimeException {

    public EmailInvalidException() {
        super("E-mail inválido");
    }

    public EmailInvalidException(String msg) {
        super(msg);
    }
}
