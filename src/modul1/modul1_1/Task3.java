package modul1.modul1_1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значеня x,y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double rezultat = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * (Math.sin(x * y) / Math.cos(x * y));
        System.out.printf("rezultat=%.2f",rezultat);
    }
}
