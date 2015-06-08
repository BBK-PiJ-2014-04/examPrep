package Generics;

/**
 * Created by scarda01 on 08/06/2015.
 */
public class Mammal implements Comparable<Mammal> {
    public final String race = "Optional.Generics.Mammal";
    public boolean isAnimal = true;
    public boolean isAnphibious = false;
    public int cuteness;

    @Override
    public int compareTo(Mammal o) {
        return this.cuteness - o.cuteness;
    }
}
