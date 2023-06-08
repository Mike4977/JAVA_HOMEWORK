import java.net.SocketOption;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        System.out.println(i);


        String str = Integer.toBinaryString(i);
        System.out.println(str);
        int n = str.length();
        System.out.println(n);

        int count = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) {

            if (j % n == 0) System.out.println(j);
            count++;
        }
        for (int k = Short.MIN_VALUE; k <= i ; k++) {
            if (i % n != 0) System.out.println(k);
            count++;
        }
    }
}