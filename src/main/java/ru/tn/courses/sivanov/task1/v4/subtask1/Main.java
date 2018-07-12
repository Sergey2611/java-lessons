package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int sizeOfArray = scanner.nextInt();
        int[] mass1 = new int[sizeOfArray];

        if (sizeOfArray == 1) {
            System.out.println("Массив состоит из одного числа, то есть не является последовательностью");
            System.exit(0);
        }

        System.out.println("Введите элементы массива");
        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        int[] mass2 = mass1.clone();
        Arrays.sort(mass2);

        if (Arrays.equals(mass1, mass2) == true) {
            System.out.println("Последовательность чисел является возрастающей");
        } else {
            System.out.println("Последовательность чисел не является возрастающей");
        }
    }
}
