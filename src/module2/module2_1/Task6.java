package module2.module2_1;

import java.util.Random;
import java.util.Scanner;


public class Task6 {


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

    static boolean prostoe(int a) {
        int col = 0;
        if (a != 0 && a != 1 && a != 2) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    col++;
            }
            return col == 2 ? true : false;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элесентов в массиве");
        int n = scanner.nextInt();
        int[] array = readArray(n);
        System.out.println("Массив:");
        writeArray(array);
        System.out.println("\nСумма элементов с простым пор номером:");
        System.out.println(summa(array));

    }

    private static int summa(int[] array) {
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            if(prostoe(i+1)) {
                System.out.printf("sum =sum + a[%d]=%d + %d=",i,sum,array[i]);
                sum += array[i];
                System.out.println(sum);
            }
        }
        return sum;
    }
}
