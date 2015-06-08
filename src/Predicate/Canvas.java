package Predicate;

import java.util.List;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class Canvas {
    public void draw(Shape s) {
        s.draw(this);
    }

    public void drawAll(List<? extends Shape> shapes) {
        for (Shape s: shapes) {
            s.draw(this);
        }
    }
}

abstract class Shape {
    public abstract void draw(Canvas c);
}

class Circle extends Shape {
    private int x, y, radius;
    public void draw(Canvas c) {
        System.out.println("draw");
    }
}

class Rectangle extends Shape {
    private int x, y, width, height;
    public void draw(Canvas c) {
        System.out.println("draw");
    }
}