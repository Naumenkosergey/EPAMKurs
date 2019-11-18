package module2.module2_1;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    static int replase(int[] mas, int z) {
        int col = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
                col++;
            }
        }
        return col;
    }

    static int[] readArray(int n) {
        int[] mas = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt() % 10 + 40 - 30;
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
        System.out.println("Введите число проверки");
        int k = scanner.nextInt();
        int[] array = readArray(n);
        System.out.println("Массив:");
        writeArray(array);
        System.out.println("\nколичество замен = " + replase(array, k));
        System.out.println("Новый Массив:");
        writeArray(array);
    }
}
