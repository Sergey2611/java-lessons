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
        int sizeOfMass1 = scanner.nextInt();
        int[] mass1 = new int[sizeOfMass1];
        int sizeOfMass2 = 0;
        for (int i = 0; i < sizeOfMass1; i++) {
            mass1[i] = random.nextInt(100);
            if (mass1[i] % 2 == 0 && mass1[i] != 0) {
                sizeOfMass2++;
            }
        }

        int[] mass2 = new int[sizeOfMass2];
        int counter = 0;
        for (int i = 0; i < sizeOfMass1; i++) {
            if (mass1[i] % 2 == 0 && mass1[i] != 0) {
                mass2[counter] = mass1[i];
                counter++;
            }
        }

        Arrays.sort(mass1);
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        if (counter == 0) {
            System.out.println("Четных чисел в исходном массиве нет");
        } else {
            Arrays.sort(mass2);
            System.out.println("Массив, содержащий только четные числа исходного массива");
            System.out.println(Arrays.toString(mass2));
        }
    }
}
