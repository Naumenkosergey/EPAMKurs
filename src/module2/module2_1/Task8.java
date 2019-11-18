package module2.module2_1;

import java.util.Random;
import java.util.Scanner;


public class Task8 {


    static int[] readArray(int n, int k) {
        int[] mas = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt() % 10 + k;
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
        int[] array = readArray(n, 0);
        System.out.println("Массив:");
        writeArray(array);
        int[] newArray = new int[array.length - colMin(array, min(array))];
        System.out.println("\nкол. эл. нового массива " + newArray.length + " min " + min(array));
        replase(array, newArray, min(array));
        System.out.println("\nПолученный Массив:");
        writeArray(newArray);
    }


    private static void replase(int[] array, int[] newArray, int min) {
        int i = 0;
        for (int el : array) {
            if (el != min) {
                newArray[i] = el;
                i++;
            }
        }
    }

    private static int colMin(int[] array, int min) {
        int col = 0;
        for (int el : array) {
            if (el == min)
                col++;
        }
        return col;
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
