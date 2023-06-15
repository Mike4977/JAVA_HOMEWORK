import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Home3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int j = new Random().nextInt(200);
            list.add(j);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) list.remove(i);
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
