package module2.module2_1;

import java.util.Random;
import java.util.Scanner;


public class Task4 {


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
        int indexMin = min(array);
        int indexMax = max(array);
        replase(array, indexMin, indexMax);
        System.out.println("\nПолученный Массив:");
        writeArray(array);

    }

    private static int max(int[] array) {
        int max = array[0];
        int ind = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                ind = i;
            }
        }
        return ind;
    }

    private static void replase(int[] array, int indexMin, int indexMax) {
        int buf=array[indexMin];
        array[indexMin]=array[indexMax];
        array[indexMax]=buf;
    }

    private static int min(int[] array) {
        int min = array[0];
        int ind = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                ind = i;
            }
        }
        return ind;
    }
}
