import java.util.HashMap;
import java.util.Iterator;

public class Home6 {
    public static void main(String[] args) {
        Set<Integer> set = new Set();
        System.out.println(set.add(123));
        System.out.println(set.add(14543));
        System.out.println(set.add(145));
        System.out.println(set.remove(123));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        Iterator<Integer> iterator = set.iter();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Set<E>{
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VALL = new Object();

    public boolean add(E num){
        return set.put(num, VALL) == null;
    }

    public boolean remove(E num){
        return set.remove(num) == VALL;
    }
    public int size(){
        return set.size();
    }
    public boolean isEmpty(){
        return set.isEmpty();
    }
    public Iterator<E> iter(){
        return set.keySet().iterator();
    }
    }
}
