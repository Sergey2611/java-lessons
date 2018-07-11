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

        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass1));

        if (size == 1) {
            System.out.println("Массив состоит из одного числа, то есть не является последовательностью");
            System.exit(0);
        }

        int[] mass2 = mass1.clone();
        Arrays.sort(mass2);


        if (Arrays.equals(mass1,mass2) == true) {
            System.out.println("Последовательность чисел является возрастающей");
        } else {
            System.out.println("Последовательность чисел не является возрастающей");

        }
    }
}
