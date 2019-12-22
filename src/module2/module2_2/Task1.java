package module2.module2_2;

import module2.util.Matr;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов");
        int str = scanner.nextInt();
        int stb = scanner.nextInt();
        int [][] matr= new int[str][stb];
        Matr matrica = new Matr();
        matrica.readMatr(matr);
        System.out.println("Исходная матрица:");
        matrica.writeMatr(matr);
    }


}
