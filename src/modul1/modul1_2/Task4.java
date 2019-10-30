package modul1.modul1_2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия, шириина и длина");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите размеры кирпича x,y,z, шириина, высота и длина");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (((a >= x) && ((b >= y) || (b >= z))) || ((a >= y) && ((b >= x) || (b >= z))) || ((a >= z) && ((b >= y) || (b >= x))) ||
                ((b >= x) && ((a >= y) || (a >= z))) || ((b >= y) && ((a >= x) || (a >= z))) || ((b >= z) && ((a >= y) || (a >= x))))
            System.out.printf("кирпич %d, %d, %d проходит через отверстие %d на %d", x, y, z, a, b);
        else
            System.out.printf("кирпич %d, %d, %d не проходит через отверстие %d на %d", x, y, z, a, b);
    }
}
