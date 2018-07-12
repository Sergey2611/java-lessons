package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int sizeOfArray = scanner.nextInt();
        int[] mass1 = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = random.nextInt(100);
            if (random.nextInt(2) > 0) mass1[i] *= (-1);
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        int j;
        for (int gap = mass1.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < mass1.length; i++) {
                int arrayElement = mass1[i];
                for (j = i; j >= gap && mass1[j - gap] > arrayElement; j -= gap) {
                    mass1[j] = mass1[j - gap];
                }
                mass1[j] = arrayElement;
            }
        }

        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(mass1));
    }
}
