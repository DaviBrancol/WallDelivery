package model;

public class Response<T> {
    
    public T object;
    public String message;
    public boolean success;
    
    public Response(T object, String message, boolean success) {
        this.object = object;
        this.message = message;
        this.success = success;
    }
    public Response(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
    public Response(boolean success) {
        this.success = success;
    }
    
}
