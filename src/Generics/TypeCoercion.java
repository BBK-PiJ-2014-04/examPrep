package Generics;

/**
 * Created by scarda01 on 08/06/2015.
 */
public class TypeCoercion {
    public static void main(String[] args) {
        Mammal m = new Generics.Cat();
        //m.purr(); not legal
        ((Cat) m).purr(); //legal
        //Optional.Generics.Cat f = m; illegal, downcasting must be always specified
        Cat f = (Generics.Cat) m; //legal
    }
}
