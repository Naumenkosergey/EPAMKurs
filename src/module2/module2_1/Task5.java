package module2.module2_1;

import java.util.Random;
import java.util.Scanner;


public class Task5 {


    static int[] readArray(int n) {
        int[] mas = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt() % 10;
        }
        return mas;
    }

    static void writeArray(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > k)
                System.out.print(a[i] + " ");
        }
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
        System.out.println("Введите значение больше которого следует вывести");
        int k = scanner.nextInt();
        int[] array = readArray(n);
        System.out.println("Массив:");
        writeArray(array);
        System.out.println("\nЭлементы которые больше " + k);
        writeArray(array, k);
    }
}
