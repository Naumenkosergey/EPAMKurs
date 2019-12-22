package module2.module2_2;

import module2.util.Matr;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы (кол-во строк и столбцов)");
        int str = scanner.nextInt();
        int stb = scanner.nextInt();
        double[][] matr = new double[str][stb];
        Matr matrica = new Matr();
        matrica.readMatrTask7(matr);
        System.out.println("Полученная матрица:");
        matrica.writeMatr(matr);
        System.out.println("количество положительных элементов: " + colPol(matr));
        ;
    }

    private static int colPol(double[][] matr) {
        int col = 0;
        for (double[] mas : matr) {
            for (double el : mas) {
                if (el > 0)
                    col++;
            }
        }
        return col;
    }
}
