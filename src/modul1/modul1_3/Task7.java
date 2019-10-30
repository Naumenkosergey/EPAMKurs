package modul1.modul1_3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения отрезка от a до b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            int col = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    col++;
                    System.out.printf("%d делится на %d\n", i, j);
                }
            }
            if (col == 2)
                System.out.println(i + " простое число");
            System.out.println("-----------------------");
        }
    }
}
