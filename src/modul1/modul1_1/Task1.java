package modul1.modul1_1;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения a, b, c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double rezultat = ((a - 3) * b / 2.0) + c;
        System.out.println("z=((a-3)*b/2)+c=" + rezultat);


    }
}
