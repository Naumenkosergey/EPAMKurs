package modul1.modul1_1;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (((Math.abs(x) <= 2) && (y >= 0) && (y <= 4)) || ((Math.abs(x) <= 4) && (y <= 0) && (y >= -3)))
            System.out.printf("точка с координатами %d, %d находится в области", x, y);

        else
            System.out.printf("точка с координатами %d, %d находится в  внеобласти", x, y);
    }
}
