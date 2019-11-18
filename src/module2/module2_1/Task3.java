package module2.module2_1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    static void task(int[] mas) {
        int colNul = 0;
        int colOtr = 0;
        int colPol = 0;
        for (int el : mas) {
            if (el > 0)
                colPol++;
            else if (el < 0)
                colOtr++;
            else
                colNul++;
        }
        System.out.printf("\nКоличество отпицательных элементов: %d, положительных: %d, равных нулю: %d", colOtr, colPol, colNul);
    }

    static int[] readArray(int n) {
        int[] mas = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt() % 10;
        }
        return mas;
    }

    static void writeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элесентов в массиве");
        int n = scanner.nextInt();
        int[] array = readArray(n);
        System.out.println("Массив:");
        writeArray(array);
        task(array);
    }
}
