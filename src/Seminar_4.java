import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Seminar_4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        input_data(lst);
        print_data(lst);
        System.out.println("Выберите действие: q - выход, s - сортровка, a - сортировка по возрасту");
        String data = scanner.nextLine();
        if (data.equals("q")) System.exit(0);
        if (data.equals("s")) data_array(lst);

        System.exit(0);
        if (data.equals("a"))
            sortdata_age(lst);
        print_data(lst);
    }
    static void input_data(ArrayList<String> arr) {
        System.out.println("Введите фамилию имя отчество возраст и пол ");
//        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("q")) return;
            arr.add(data);
        }
    }
    static void print_data(ArrayList<String> arr) {
        for (String i : arr) {
            String[] str = i.split(" ");
            System.out.println(str[0] + " " + str[1].toUpperCase().charAt(0) + " " +
                    str[2].toUpperCase().charAt(0) + " " + str[3] + " " + str[4]);
        }
    }
    static void sortdata_age(ArrayList<String> arr) {
        arr.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
    }

    static void data_array(ArrayList<String> arr) {

        System.out.println("Выберите действие: 1 - сортировка по фамилии, 2 - сортировка по возрасту, 3 - сортировка по полу, q - выход");
        String select = scanner.nextLine();
        int j = 0;
        if (select.equals("1")) j = 0;
        if (select.equals("2")) j = 3;
        if (select.equals("3")) j = 4;
        if (select.equals("q")) System.exit(0);
        for (String i : arr) {
            String[] str = i.split(" ");
            ArrayList<String> array = new ArrayList<>();
            array.add(str[j]);
            System.out.println(array);
        }
    }
}
