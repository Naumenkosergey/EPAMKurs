package modul1.modul1_3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        System.out.printf("Сумма от 1 до %d = %d", number, sum);
    }
}
