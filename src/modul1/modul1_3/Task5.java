package modul1.modul1_3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        for (int i = -n; i <= n; i++) {
            double a;
            a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
            if (Math.abs(a) >= e)
                System.out.printf("a[%d]=%.3f \n", i, a);
        }
    }
}
