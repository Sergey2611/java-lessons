package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int k;
	    int n;
	    int summ = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        n = scanner.nextInt();
        System.out.println("Введите k");
        k = scanner.nextInt();

        int[] mass1 = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            mass1[i] = random.nextInt(10);
            System.out.println(mass1[i]);
            if (mass1[i]%k == 0) {
                summ = summ + mass1[i];
            }

        }
        System.out.println("Сумма чисел кратных " + k + " равна " + summ);


    }
}
