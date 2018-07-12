package com.company;

import java.util.Arrays;
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
            if (random.nextInt(2) > 0) {
                mass1[i] = mass1[i] * (-1);
            }
        }

        System.out.println(Arrays.toString(mass1));

        if (mass1[0] > 0) {
            System.out.println("Первый элемент массива положительный и равен " + mass1[0]);
        } else if (mass1[0] < 0) {
            System.out.println("Первый элемент массива отрицательный и равен " + mass1[0]);
        } else if (mass1[0] == 0) {
            System.out.println("Первый элемент массива равен нулю");
        }
    }
}