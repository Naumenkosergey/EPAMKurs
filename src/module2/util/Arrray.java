package module2.util;

import java.util.Random;

public class Arrray {
    public void writeArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public void writeArray(double[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public void readArray(int[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt() % 10 + 10;
        }
    }

    public void readArray(double[] mas) {
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextDouble();
        }
    }

    public void readSortrArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
    }

    public void sortArrayviborUbivanie(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int indMax = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    indMax = j;
                }
            }
            swap(array, i, indMax);//меняем местами первый и максимальный
        }

    }

    private void swap(int[] array, int i, int indMax) {
        int buf = array[i];
        array[i] = array[indMax];
        array[indMax] = buf;
    }


}
