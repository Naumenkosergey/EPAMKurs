package modul1.modul1_2;

import java.util.Scanner;

//import static java.lang.Math.max;
//import static java.lang.Math.min;

public class Task2 {

    private static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    private static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения для a, b, c, d");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(max(min(a, b), min(c, d)));

    }


}
