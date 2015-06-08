package Optional;

import java.util.Optional;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class ExOptional {

    public static void main(String[] args) {
        Generics m = new Generics();
        Integer l = new Integer(23);
        Double f = new Double(23.5);


        Optional<Generics> myOptional = Optional.of(m);
        System.out.println(myOptional.get().getM());
        //myOptional.filter(z -> z.length() > 2).ifPresent(x -> System.out.println(x));

        Optional<Number> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElseThrow(RuntimeException::new).equals(f));
        emptyOptional.ifPresent(x -> System.out.println(x.intValue() + 16));


        Optional<Number> intOptional = Optional.of(l);
        System.out.println(intOptional.orElseThrow(RuntimeException::new).equals(f));
        intOptional.ifPresent(x -> System.out.println(x.intValue() + 16));

        Optional<Number> newOptional = Optional.empty();
        System.out.println(newOptional.orElse(f).equals(f));

        Container<Integer,String> myCont = new Container<Integer,String>();
        myCont.addObject(5,"Mike");
        myCont.addObject(9,"Jim");
        myCont.addObject(32,"Micheal");
        myCont.addObject(54,"Mark");
        myCont.getObject(7).ifPresent(x -> System.out.println(x.substring(1, 3)));
        myCont.getObject(23).ifPresent(x -> System.out.println(x.substring(1, 3)));
        myCont.getObject(32).ifPresent(x -> System.out.println(x.substring(1, 3)));


    }
}
