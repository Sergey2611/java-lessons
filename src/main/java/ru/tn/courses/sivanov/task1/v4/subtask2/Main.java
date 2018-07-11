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
            mass1[i] = random.nextInt(100);
        }
        Arrays.sort(mass1);
        System.out.println(Arrays.toString(mass1));
        int k = 0;
        for (int i = 0; i < size; i++) {
            int z = mass1[i];
            if (mass1[i] == 0){
                continue;
            } else if (mass1[i] == 1) {
                System.out.println("Элемент массива " + mass1[i] + " под номером " + (i+1) + " является " + k +" степенью двух");
            } else if (z % 2 == 0){
                while (z % 2 == 0 ){
                    z /= 2;
                    k++;
                    if (z == 1) {
                        System.out.println("Элемент массива " + mass1[i] + " под номером " + (i+1) + " является " + k +" степенью двух");
                        break;
                    }
                }
                k = 0;
            }
        }
    }
}
