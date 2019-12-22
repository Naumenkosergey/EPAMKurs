package module2.module2_2;

import module2.util.Matr;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int str = scanner.nextInt();
        int[][] matr = new int[str][str];
        Matr matrica = new Matr();
        if (str % 2 == 0) {
            System.out.println("Полученная матрица:");
            matrica.readMatrTask5(matr);
            matrica.writeMatr(matr);
        } else {
            System.out.println("размер должен быть четным");
        }
    }
}
