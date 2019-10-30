package modul1.modul1_3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите промежуток от a до b");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите шаг");
        double h = scanner.nextDouble();
        double y;
        while (a <= b) {
            if (a <= 2)
                y = -a;
            else
                y = a;
            System.out.printf("y=%.2f, при x=%.2f\n", y, a);
            a += h;
        }

    }
}
