import java.util.*;

public class Seminar5 {
    static Scanner scanner = new Scanner(System.in);
    //    1.Создать словарь, ключи индекс а значение случайное число. Вывести пары ключ -  значение в консолью
    public static void main(String[] args) {
        Map<Integer, Integer> dict = new HashMap<>();
        Random rnd = new Random();
        for (int i = 0; i < 15; i++) {
            dict.put(i, rnd.nextInt(10));
        }
        System.out.println(dict);
//        2.Создать словарь, ключи индекс а значение случайное число. Вывести в консоль ключ
//        -  значение тех пар у которых значение кратно трём

        //первое решение (простое)
        for (int i : dict.keySet()) if (dict.get(i) %3 == 0) System.out.println(i + " = " + dict.get(i));

        //второе решение 
//        for (int i : dict.values()) {
            Iterator<Integer> iterator = dict.keySet().iterator();
            while (iterator.hasNext()) {
                int j = iterator.next();
                if (dict.get(j) % 3 == 0) System.out.println(j + " - " + dict.get(j));
            }
//        }
//        3.Создать два словаря, ключи обеих словарей случайное число, значения первого
//        словаря мужские имена а второго женские. Вывести сумму значений тех пар словарей
//        у которых совпал ключ.


        Map<Integer, String> dict2 = new HashMap<>();
        Map<Integer, String> dict1 = new HashMap<>();
//        for (int i = 0; i < 5; i++) {
//            String men_name = scanner.nextLine();
//            dict.put(rnd.nextInt(10), men_name);
//            String women_name = scanner.nextLine();
//            dict.put(rnd.nextInt(10), dict2.get(women_name));
//        }

        dict1.put(rnd.nextInt(10), "петя");
        dict1.put(rnd.nextInt(10), "вася");
        dict1.put(rnd.nextInt(10), "вова");
        dict1.put(rnd.nextInt(10), "саша");
        dict1.put(rnd.nextInt(10), "миша");

        dict2.put(rnd.nextInt(10), "инна");
        dict2.put(rnd.nextInt(10), "нина");
        dict2.put(rnd.nextInt(10), "маня");
        dict2.put(rnd.nextInt(10), "вера");
        dict2.put(rnd.nextInt(10), "аня");

        System.out.println(dict1);
        System.out.println(dict2);

        for (int k : dict1.keySet()) {
            //первое решение
//            for (int l : dict2.keySet()) if (k == l) System.out.println(dict1.get(k) + " + " + dict2.get(k));
            //второе решение
           if (dict1.containsKey(k))
                System.out.println(dict1.get(k) + " + " + dict2.get(k));
        }

        // 4.Создать словарь, ключи индекс а значение случайное число.Вывести пары: ключ и квадрат значения.
        Map<Integer, Integer> dict4 = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            dict4.put(i, rnd.nextInt(10));
        }
        System.out.println(dict4);
        for (int i : dict.keySet()) System.out.println(i + "-" + dict4.get(i) * dict4.get(i));

        //5.Реализовать предыдущее задание без использования циклов.

        System.out.println(dict4);
        dict4.forEach((key, value) -> System.out.println(key + "-" + value * value));

        //6.Реализовать предыдущее задание без использования циклов и forEach().

        System.out.println(dict4);
        dict4.replaceAll((key, value) -> value * value);
        System.out.println(dict4);
        dict4.compute(1, (key, value) -> value != null ? value + 1: 0);
        System.out.println(dict4);
        dict4.computeIfAbsent(18, value -> value != null ? value + 1: 124);
        System.out.println(dict4);
        dict4.computeIfPresent(1, (key, value) -> value != null ? value + 1: 0);
        System.out.println(dict4);
        dict4.merge(3, 123, (old, new_v) -> old + new_v);
        System.out.println(dict4);
    }
}
