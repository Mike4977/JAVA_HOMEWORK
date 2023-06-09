import java.util.*;


public class Home3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int j = new Random().nextInt(200);
            list.add(j);
        }
        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i) % 2 == 0) list.remove(i);
//        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        int sum = 0;

        for (int i = 0; i < list.size(); i++) sum +=list.get(i);

        double avg;
        double size = list.size();
        System.out.println(avg = sum / size);

    }
}
