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
        int[] m1 = new int[Short.MAX_VALUE];
        for (int j = i; j <= Short.MAX_VALUE; j++) {

            if (j % n == 0) m1[count] = j;
            if (m1[count] != 0) System.out.print(m1[count] + "; ");
            count++;
        }
        System.out.println(" ");
        System.out.println("++++++++++++++++++");

        count = 0;
        int[] m2 = new int[Math.abs(Short.MIN_VALUE) + i];
        for (int k = Short.MIN_VALUE ; k < i ; k++) {
            if (i % n != 0) m2[count] = k;
            if (m2[count] != 0) System.out.print(m2[count] + "; ");
            count++;
        }
    }
}