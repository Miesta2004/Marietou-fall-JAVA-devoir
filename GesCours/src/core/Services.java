package core;
import java.util.List;

public interface Services<T> {
    boolean save (T objet);
    List<T> show();
    T findById(String id);
    int count();
}