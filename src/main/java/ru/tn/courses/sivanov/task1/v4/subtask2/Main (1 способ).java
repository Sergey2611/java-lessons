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
        int sizeOfArray = scanner.nextInt();
        int[] mass1 = new int[sizeOfArray];
        boolean flag = false;
        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = random.nextInt(100);
        }
        Arrays.sort(mass1);
        System.out.println(Arrays.toString(mass1));
        int counter = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            int arrayElement = mass1[i];
            if (mass1[i] == 0) {
                continue;
            } else if (mass1[i] == 1) {
                System.out.println("Элемент массива " + mass1[i] + " под номером " + (i + 1) + " является " + counter + " степенью двух");
                flag = true;
            } else if (arrayElement % 2 == 0) {
                while (arrayElement % 2 == 0) {
                    arrayElement /= 2;
                    counter++;
                    if (arrayElement == 1) {
                        System.out.println("Элемент массива " + mass1[i] + " под номером " + (i + 1) + " является " + counter + " степенью двух");
                        flag = true;
                        break;
                    }
                }
                counter = 0;
            }
        }

        if (flag == false) System.out.println("В массиве нет элементов, которые являются степенью двух");
    }
}
