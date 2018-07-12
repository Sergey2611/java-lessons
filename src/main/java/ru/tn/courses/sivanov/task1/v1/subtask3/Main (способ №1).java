package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sizeOfArray = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры последовательностей чисел (положительное целое число)");
        try {
            sizeOfArray = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Введено не число, либо введено дробное/отрицательное число");
            System.exit(0);
        }
        int[] mass1 = new int[sizeOfArray];
        int[] mass2 = new int[sizeOfArray];
        Random random = new Random();

        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = random.nextInt(100);
            mass2[i] = random.nextInt(100);
        }

        Arrays.sort(mass1);
        Arrays.sort(mass2);
        System.out.println("Первая возрастающая последовательность чисел " + Arrays.toString(mass1));
        System.out.println("Вторая возрастающая последовательность чисел " + Arrays.toString(mass2));

        int k = 0;
        boolean flag = false;
        System.out.println("Возрастающая последовательность чисел, образованная из двух предыдущих");
        for (int i = 0; i < sizeOfArray; i++) {
            if (mass1[0] <= mass2[0]) {
                flag = true;
                System.out.print("[" + mass1[i] + "] ");
                for (int j = 0; j < sizeOfArray; j++) {
                    try {
                        if (mass2[j] > mass1[i] && mass2[j] <= mass1[i + 1]) {
                            System.out.print("[" + mass2[j] + "] ");
                        } else continue;
                    } catch (Exception e) {
                        k++;
                    }
                }
            } else {
                System.out.print("[" + mass2[i] + "] ");
                for (int j = 0; j < sizeOfArray; j++) {
                    try {
                        if (mass1[j] > mass2[i] && mass1[j] <= mass2[i + 1]) {
                            System.out.print("[" + mass1[j] + "] ");
                        } else continue;
                    } catch (Exception e) {
                        k++;
                    }
                }
            }
        }

        if (k != 0) {
            if (flag == true) {
                for (int i = (sizeOfArray - k); i < sizeOfArray; i++) {
                    System.out.print("[" + mass2[i] + "] ");
                }
            } else {
                for (int i = (sizeOfArray - k); i < sizeOfArray; i++) {
                    System.out.print("[" + mass1[i] + "] ");
                }
            }
        }
    }
}