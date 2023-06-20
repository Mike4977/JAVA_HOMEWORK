import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Home4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();

        input_data(surname, name, patronymic, age, gender);
        print_data(surname, name, patronymic, age, gender);

        System.out.println("Выберите действие: q - выход, s - сортровка, a - сортировка по возрасту");
        String data = scanner.nextLine();
        if(data.equals("q")) return;

        if(data.equals("a")) sort_age(age);
        if(data.equals("s")) sort_surname(surname);
    }

    public static void input_data(ArrayList<String> surname, ArrayList<String> name, ArrayList<String> patronymic,
                                  ArrayList<Integer> age, ArrayList<String> gender) {
        System.out.println("Введите фамилию, имя, отчество, возраст и пол ");
        while (true) {

            String data = scanner.nextLine();
            if (data.equals("q")) return;
            String[] str = data.split(" ");
            surname.add(str[0]);
            name.add(str[1]);
            patronymic.add(str[2]);
            age.add(Integer.parseInt(str[3]));
            gender.add(str[4]);
        }
    }
    static void print_data(ArrayList<String> surname, ArrayList<String> name, ArrayList<String> patronymic,
                           ArrayList<Integer> age, ArrayList<String> gender) {
        for (int i = 0; i < surname.size(); i++) {
            System.out.println(surname.get(i) + " " + name.get(i).charAt(0) + " " + patronymic.get(i).charAt(0) + " " + age.get(i) + " " + gender.get(i));
        }
    }
    static void sort_surname(ArrayList<String> arr) {
        Collections.sort(arr);
        System.out.println(arr);
    }
    static void sort_age(ArrayList<Integer> arr){
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            index.add(i);
        }

        for (int j = 0; j < arr.size() - 1; j++) {
            for (int k = 0; k < arr.size() - j - 1; k++) {
                if (arr.get(k + 1) < arr.get(k)) {
                    int tmp = arr.get(k);
                    int tmp1 = index.get(k);
                    int tmp2 = arr.get(k+1);
                    int tmp3 = index.get(k+1);

                    arr.remove(k+1);
                    arr.remove(k);
                    index.remove(k+1);
                    index.remove(k);
                    arr.add(k,tmp2);
                    arr.add(k+1,tmp);
                    index.add(k,tmp3);
                    index.add(k+1,tmp1);
                }
            }

        }
        System.out.println(index);
    }
}

