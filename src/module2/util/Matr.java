package module2.util;

import java.util.Random;

public class Matr {

    //Вывод матрицы
    public void writeMatr(int[][] matr) {
        for (int[] a : matr) {
            for (int b : a) {
                System.out.printf("% -3d", b);
            }
            System.out.println();
        }
    }

    public void writeMatr(double[][] matr) {
        for (double[] a : matr) {
            for (double b : a) {
                System.out.printf("% .2f   ", b);
            }
            System.out.println();
        }
    }

    //заполнение матрицы
    public void readMatr(int[][] matr) {
        Random random = new Random();
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = random.nextInt() % 10;
            }
        }
    }

    //Заполнение матрицы по 4 заданию
    public void readMatrTask4(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (i % 2 == 0) {
                    matr[i][j] = j + 1;
                } else {
                    matr[i][j] = matr.length - j;
                }
            }
        }
    }

    //Заполнение матрицы по 4 заданию
    public void readMatrTask5(int[][] matr) {
        int k = 1;
        boolean flag = false;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (j == matr.length - i) {
                    flag = true;
                }
                if (!flag) {
                    matr[i][j] = k;
                } else {
                    matr[i][j] = 0;
                }
            }
            k++;
            flag = false;
        }
    }

    public void readMatrTask7(double[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = Math.sin((i * i - j * j) / (matr.length));
            }
        }
    }

}
