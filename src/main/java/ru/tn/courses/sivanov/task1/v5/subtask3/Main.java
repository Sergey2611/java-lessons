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
        int size = scanner.nextInt();
        int[] mass1 = new int[size];
        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        int z;
        for (int gap = mass1.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < mass1.length; i++) {
                int a = mass1[i];
                for (z = i; z >= gap && mass1[z - gap] > a; z -= gap) {
                    mass1[z]=mass1[z-gap];
                }
                mass1[z] = a;
            }
        }

        System.out.println("Отсортированный массив");
        System.out.println(Arrays.toString(mass1));
    }
}
