package Exceptions;

public class CPFInvalidException extends RuntimeException {

    public CPFInvalidException() {
        super("CPF Inválido, por favor digite novamente");
    }

    public CPFInvalidException(String msg) {
        super(msg);
    }
}
