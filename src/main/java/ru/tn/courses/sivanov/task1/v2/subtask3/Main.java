package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность массива");
        int size = scanner.nextInt();
        int[] mass1 = new int[size];
        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(10);
            if (random.nextInt(10) >= 5) {
                mass1[i] = mass1[i]*(-1);
            }
        }

        System.out.println("Неотсортированный массив");
        System.out.println(Arrays.toString(mass1));

        for (int i = 0; i < mass1.length; i++) {
            int min = mass1[i];
            int imin = i;
            for (int j = i+1; j < mass1.length; j++) {
                if (mass1[j] < min) {
                    min = mass1[j];
                    imin = j;
                }
            }
            if (imin != i) {
                int k = mass1[i];
                mass1[i] = mass1[imin];
                mass1[imin] = k;
            }
        }

        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(mass1));
    }
}