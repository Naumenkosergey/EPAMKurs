package modul1.modul1_2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для x");
        double x = scanner.nextDouble();
        double rezultat;
        if (x <= 3)
            rezultat = x * x - 3 * x + 9;
        else
            rezultat = 1.0 / (x * x * x + 6);
        System.out.printf("при x=%.2f, результат=%.3f", x, rezultat);
    }
}
