package genericTypes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void literalGenericTypes(HashMap<List<Integer>, HashMap<String, List<List<Double>>>>  crazyParams){

    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}