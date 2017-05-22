package Exceptions;

public class SizeException extends RuntimeException {

    public SizeException(String field) {
        super("O campo " + field + " não pode estar vazio");
    }
}
