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

        for (int i = 0; i < sizeOfArray; i++) {
            if ((int) (Math.log(mass1[i]) / Math.log(2)) == (Math.log(mass1[i]) / Math.log(2))) {
                System.out.println("Элемент массива " + mass1[i] + " является степенью двух");
                flag = true;
            }
        }

        if (flag == false) System.out.println("В данном массиве нет чисел, которые являются степенью двух");
    }
}