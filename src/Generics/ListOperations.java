package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by scarda01 on 07/06/2015.
 */
public class ListOperations {


    public <T extends Object & Comparable<? super T>> T findMinimum(List<? extends T> passedList) {
        T minimum = null;
        for(T entry : passedList) {
            if(minimum == null) {
                minimum = entry;
            }
            else {
                if (entry.compareTo(minimum) < 0) {
                    minimum = entry;
                }
            }
        }
        return minimum;
    }

    public <T extends Object & Comparable<? super T>> Optional<T>
        findMaximum(List<? extends T> passedList){
        T maximum = null;
        for(T entry : passedList) {
            if(maximum == null) {
                maximum = entry;
            }
            else {
                if(entry.compareTo(maximum) > 0) {
                    maximum = entry;
                }
            }
        }
        if(maximum == null) {
            return Optional.empty();
        }
        else {
            return Optional.of(maximum);
        }

    }

    public static void main(String[] args) {
        ListOperations listOperator = new ListOperations();
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(25);
        myList.add(27);
        myList.add(57);
        myList.add(37);
        myList.add(1);
        myList.add(5);
        System.out.println(listOperator.findMinimum(myList));

        List<Mammal> myList3 = new ArrayList<>();
        Mammal cane = new Dog();
        cane.cuteness = 23;
        Mammal gatto = new Cat();
        gatto.cuteness = 15;
        myList3.add(cane);
        myList3.add(gatto);
        System.out.println(listOperator.findMinimum(myList3));
        System.out.println(listOperator.findMaximum(myList3));

    }
}
