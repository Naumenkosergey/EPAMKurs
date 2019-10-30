package modul1.modul1_2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 угла в градусах");
        int alpha = scanner.nextInt();
        int betta = scanner.nextInt();

        if (180 > (alpha + betta)) {
            System.out.println("Треугольник существует");
            System.out.printf("третий угол треульника равен %d градусов\n", 180 - (alpha + betta));
            if ((alpha == 90) || (betta == 90) || ((180 - (alpha + betta)) == 90))
                System.out.println("Треугольник прямоугольный");
            else
                System.out.println("Треугольник непрямоугольный");
        } else
            System.out.printf("Треугольник c углами %d , %d не существует", alpha, betta);
    }
}
