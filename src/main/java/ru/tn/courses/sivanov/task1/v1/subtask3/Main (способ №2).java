package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0, m = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры последовательностей чисел (положительное целое число)");
        try {
            n = scanner.nextInt();

        } catch (Exception e) {
            System.out.println("Введено не число, либо введено дробное/отрицательное число");
            System.exit(0);
        }
        int[] mass1 = new int[n];
        int[] mass2 = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            mass1[i] = random.nextInt(100);
            mass2[i] = random.nextInt(100);
        }

        Arrays.sort(mass1);
        Arrays.sort(mass2);
        System.out.println("Первая возрастающая последовательность чисел " + Arrays.toString(mass1));
        System.out.println("Вторая возрастающая последовательность чисел " + Arrays.toString(mass2));

        mass1 = Arrays.copyOf(mass1, mass1.length + mass2.length);

        for (int i = mass2.length; i < mass1.length; i++) {
            mass1[i] = mass2[i-mass2.length];
        }
        Arrays.sort(mass1);

        System.out.println("Возрастающая последовательность чисел, образованная из двух предыдущих");
        System.out.println(Arrays.toString(mass1));

    }
}
