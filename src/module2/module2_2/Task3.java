package module2.module2_2;

import module2.util.Matr;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов");
        int str = scanner.nextInt();
        int stb = scanner.nextInt();
        int[][] matr = new int[str][stb];
        Matr matrica = new Matr();
        matrica.readMatr(matr);
        System.out.println("Исходная матрица:");
        matrica.writeMatr(matr);
        System.out.println("Ввведите номер столбца котрый вы хотите вывести");
        int nStb = scanner.nextInt();
        System.out.println("Ввведите номер строки котрую вы хотите вывести");
        int nStr = scanner.nextInt();
        writeStr(matr, nStr, str);
        writeStb(matr, nStb, stb);
    }

    private static void writeStb(int[][] matr, int nStb, int stb) {
        if (nStb <= stb && nStb > 0) {
            System.out.println("\nСтолбец № " + nStb + " математический:");
            for (int i = 0; i < matr.length; i++) {
                System.out.println(matr[i][nStb - 1]);
            }

        } else
            System.out.println("Столбца " + nStb + " нет в матрице");
    }

    private static void writeStr(int[][] matr, int nStr, int str) {
        if (nStr <= str && nStr > 0) {
            System.out.println("Строка № " + nStr + " математическая:");
            for (int j = 0; j < matr[0].length; j++) {
                System.out.print(matr[nStr - 1][j] + " ");
            }

        } else
            System.out.println("Строки " + nStr + " нет в матрице");
    }


}
