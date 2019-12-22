package module2.module2_3;

import module2.util.Arrray;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        int[] mas = new int[n];
        Arrray arrray = new Arrray();
//        arrray.readArray(mas);  //случайно-заполненный массив
        arrray.readSortrArray(mas); //массив по возрастанию
        System.out.println("Исхлдный массив:");
        arrray.writeArray(mas);
        System.out.println("\nПолученный массив:");
        arrray.sortArrayviborUbivanie(mas);
        arrray.writeArray(mas);
    }
}
