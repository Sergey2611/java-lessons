package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k;
        int sizeOfArray;
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        sizeOfArray = scanner.nextInt();
        System.out.println("Введите k");
        k = scanner.nextInt();

        int[] mass1 = new int[sizeOfArray];
        Random random = new Random();

        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = random.nextInt(10);
            if (mass1[i] % k == 0) {
                summ = summ + mass1[i];
            }

        }
        System.out.println(Arrays.toString(mass1));
        if (summ == 0) {
            System.out.println("Чисел, кратных " + k + " в массиве нет");
        } else System.out.println("Сумма чисел кратных " + k + " равна " + summ);
    }
}
