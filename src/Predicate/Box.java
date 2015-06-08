package Predicate;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class Box<T> {
    T data;

    public Box (T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void copyFrom(Box<? extends T> from) {
        this.data = from.getData();
    }
}
