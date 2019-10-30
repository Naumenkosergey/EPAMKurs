package modul1.modul1_1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число вида ###,###");
        double number = scanner.nextDouble();
        //String str = toString(number);
        int cel = (int)number;
        System.out.println(cel);
        System.out.printf("%.3f",number-cel);
    }
}
