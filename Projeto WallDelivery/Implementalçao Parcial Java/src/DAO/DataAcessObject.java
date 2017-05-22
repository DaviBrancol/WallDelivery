package DAO;

import java.util.ArrayList;
import model.Response;

public interface DataAcessObject<T> {
    public void saveObject();
    public void addObject(T t);
    public Response removeObject(int index);
    public Response updateObject(T t, int index);
    public ArrayList<T> loadObject();
    public T getObjectIndex(int index);
    public boolean isIndexAvailable(int index);
}
