package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность массива");
        int size = scanner.nextInt();
        int[] mass1 = new int[size];
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(100);
            if (mass1[i] % 2 == 0 && mass1[i] != 0) {
                size2++;
            }
        }

        int[] mass2 = new int[size2];
        int z = 0;
        for (int i = 0; i < size; i++) {
            if (mass1[i] % 2 == 0 && mass1[i] != 0) {
                mass2[z] = mass1[i];
                z++;
            }
        }
        Arrays.sort(mass1);
        Arrays.sort(mass2);
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
    }
}
