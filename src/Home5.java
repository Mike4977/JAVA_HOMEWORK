import java.util.*;

public class Home5 {
    public static void main(String[] args) {

//        HashMap<String, ArrayList<String>> phonebook = new HashMap<>();

//        phonebook.put("Ivan", new ArrayList<>());
//        phonebook.get("Ivan").add("123");

//        // использование метода addPhone
//        addPhone(phonebook, "Ivan","1234");
//        addPhone(phonebook, "Petr", "4324");
//        addPhone(phonebook,"Ivan", "4563");
//        System.out.println(phonebook);

//        ArrayList<String> lst = new ArrayList<>();
//        for (String str: phonebook.keySet()) {
//            lst.add(str);
//        }

//        Collections.sort(lst, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return phonebook.get(o1).size() - phonebook.get(o2).size();
//            }
//
//        });
//        System.out.println(lst);
// вариант с лямбдой
//        Collections.sort(lst, (o1, o2) -> phonebook.get(o1).size() - phonebook.get(o2).size());
//            lst.forEach(nam -> System.out.println(nam + " = " + phonebook.get(nam).size()));

        //    private static void addPhone(HashMap<String, ArrayList<String>> phonebook, String name, String phone) {
//        phonebook.putIfAbsent(name, new ArrayList<>());
//        phonebook.get(name).add(phone);
//    }



        // используем merge
        HashMap<String, String> phonebook = new HashMap<>();

        phonebook.merge("ivan", "1234", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("ivan", "2134", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("ivan", "1233", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("ivan", "1324", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("Vera", "1234", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("Vera", "1423", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("Petr", "4121", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("Petr", "4312", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("Petr", "3342", (o, n) -> o == null ? n : o + " " + n);
        phonebook.merge("Olga", "4312", (o, n) -> o == null ? n : o + " " + n);

        System.out.println(phonebook);

        ArrayList<String> lst = new ArrayList<>();
        for (String str: phonebook.keySet()) {
            lst.add(str);
        }

        Collections.sort(lst, (o1, o2) -> phonebook.get(o1).split(" ").length - phonebook.get(o2).split(" ").length);
        lst.forEach(nam -> System.out.println(nam + " = " + phonebook.get(nam).split(" ").length));
    }
}
