package Predicate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class Executor {
    public static void main(String[] args) {

        LinkedList<Number> myClass = new LinkedList<>();
        myClass.add(new Integer(7));
        myClass.add(new Double(22.3));
        myClass.add(new Double(25.3));

        //Predicate.Box<Number> numBox = new Predicate.Box<Integer>(31); nope
        Box<? extends Number> numBox = new Box<Integer>(31);

        Box<Number> numBox2 = new Box<Number>(31);
        Box<Integer> numBox3 = new Box<Integer>(31);
        numBox2.copyFrom(numBox3);

        List<Shape> myList = new ArrayList<Shape>();
        List<Circle> myCircleList = new ArrayList<Circle>();
        Canvas myCanvas = new Canvas();
        myCanvas.drawAll(myList);
        myCanvas.drawAll(myCircleList);

        PredicateTest testing = new PredicateTest();
        System.out.println(testing.myTest(x -> x.substring(1, 2).equals("t")));
        System.out.println(testing.myTest(x -> x.indexOf("S") < 10));
        System.out.println(testing.myTest(x -> x.indexOf("S") == 0));
        System.out.println(testing.myTest(x -> x.append("marsar").length() > 7));
        System.out.println(myClass.stream().filter(testing.isGreaterThan(new Integer(10))).count());




    }
}
