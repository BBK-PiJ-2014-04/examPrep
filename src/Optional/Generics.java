package Optional;

import java.util.List;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class Generics<T> {
    final int m = 10;
    StringBuilder r;
    List<T> data;

    public static <T extends Comparable<T>> T findMax(T a,T b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

    public int getM() {
        return m;
    }

    public void copyTo(List<? extends T> g) {
    }
}
