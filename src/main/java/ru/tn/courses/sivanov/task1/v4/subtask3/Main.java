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

        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        int element;
        for (int i = 1; i < mass1.length; i++) {
            element = mass1[i];
            int j = i - 1;
            while (j >= 0 && element < mass1[j]) {
                mass1[j + 1] = mass1[j];
                j--;
            }
            mass1[j + 1] = element;
        }

        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(mass1));
    }
}
