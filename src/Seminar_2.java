import java.util.Scanner;

public class Seminar_2 {
    public static void main(String[] args) {

//        String str = "Hello! ";
//        System.out.println(str);
//
//        System.out.println();
//
//        StringBuilder builder = new StringBuilder("");
//        builder..
        Scanner scaner = new Scanner(System.in);
        String str1 = scaner.nextLine();
        String str2 = scaner.nextLine();


//        первое решение
//        boolean res = false;
//        if(str1.equals(str2)) res = true;
//
//        System.out.println(res);

        // второе решение
        // System.out.println(str1.equals(str2));

        //третье решение
        //System.out.println(str1.equals(scaner.nextLine())); //без второй переменной


        System.out.println(str1.equals(str2 = new StringBuilder(str2).reverse().toString()));
        str1
                .replaceAll("\\p{P}", "");
                

    }
}
