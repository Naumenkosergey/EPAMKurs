package modul1.modul1_1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int time = scanner.nextInt();
        int hours = time / 3600;
        int min = (time % 3600) / 60;
        int sek = (time % 3660) % 60 / 1;
        System.out.printf("для %d секунд прошло %d ч %d мин %d с", time, hours, min, sek);
    }
}
