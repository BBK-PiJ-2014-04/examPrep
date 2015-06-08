package Polymorphism;

/**
 * Created by scarda01 on 07/06/2015.
 */
public class A {
    int a;

    public int getA() {
        this.setA();
        System.out.println(a);
        return a;
    }

    public void setA() {
        this.a = 2;
    }

    public static void main(String[] args) {
        A m = new B();
        System.out.println(m.getA());
    }
}

class B extends A {
    int a;

    public void setA() {
        this.a = 4;
    }
}
