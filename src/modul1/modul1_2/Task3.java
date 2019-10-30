package modul1.modul1_2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точек A, B, C");
        System.out.println("Введите координаты точки A");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Введите координаты точки B");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Введите координаты точки C");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (((x3 - x1) / (x2 - x1)) == ((y3 - y1) / (y2 - y1)))
            System.out.println("точки A,B,C лежат на одной прямой");
        else
            System.out.println("точки A,B,C не лежат на одной прямой");


    }
}
