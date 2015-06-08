package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class PredicateTest {
    List<StringBuilder> myList = new ArrayList<>();

    public PredicateTest() {
        myList.add(new StringBuilder("my"));
        myList.add(new StringBuilder("new"));
        myList.add(new StringBuilder("String"));
        myList.add(new StringBuilder("Str"));
        myList.add(new StringBuilder("Ctr"));
    }

    public int myTest(Predicate<StringBuilder> m) {
       return (int) myList.stream().filter(m).count();
    }

    public Predicate<Number> isGreaterThan(Integer param) {
        return z -> z.doubleValue() > param;
    }
}
