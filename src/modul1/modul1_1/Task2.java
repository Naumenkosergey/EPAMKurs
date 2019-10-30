package modul1.modul1_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения a,b,c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double rezultat = (b + Math.pow((b * b + 4 * a * c), 0.5)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("rezultat=" + rezultat);

    }
}
