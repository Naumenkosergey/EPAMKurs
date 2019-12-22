package module2.module2_2;

import module2.util.Matr;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int str = scanner.nextInt();
        int[][] matr = new int[str][str];
        Matr matrica = new Matr();
        matrica.readMatr(matr);
        System.out.println("Исходная матрица:");
        matrica.writeMatr(matr);
        elementsOnGlDiagonal(matr);
        elementsOnPobDiagonal(matr);
    }

    private static void elementsOnPobDiagonal(int[][] matr) {
        System.out.println("\nЭлементы обочной диагонали:");
        int j = matr.length;
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][--j] + " ");
        }
    }

    private static void elementsOnGlDiagonal(int[][] matr) {
        System.out.println("Элементы главной диагонали:");
        for (int i = 0; i < matr.length; i++) {
            System.out.print(matr[i][i] + " ");
        }
    }
}
