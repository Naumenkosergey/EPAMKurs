package modul1.modul1_3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a > 0) {
            int c = a % 10;
            int d = b;
            while (d > 0) {
                int k = d % 10;
                if (c == k) {
                    System.out.printf("цифра %d есть и там и там\n", c);
                }
                d /= 10;
            }
            a /= 10;
        }
    }
}
