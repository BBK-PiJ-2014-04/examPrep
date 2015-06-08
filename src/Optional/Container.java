package Optional;

import java.util.*;

/**
 * Created by scarda01 on 06/06/2015.
 */
public class Container<K,T> {
    Map<K,T> myMap;

    public Container() {
        myMap = new HashMap<>();
    }

    public Optional<T> getObject(K key) {
        T myEntry = null;
        for(Map.Entry<K,T> entry : myMap.entrySet()) {
            if(entry.getKey().equals(key)) {
                myEntry = entry.getValue();
            }
        }
        if(myEntry != null) {
            return Optional.of(myEntry);
        }
        else {
            return Optional.empty();
        }
    }

    public void addObject(K key,T object) {
        myMap.put(key, object);
    }

}
