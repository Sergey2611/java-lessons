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
        int howManySwaps = 0;
        int k = 0;
        int[] mass1 = new int[size];

        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(10);
            if (random.nextInt(2)>0){
                mass1[i] = mass1[i] * (-1);
            }
        }

        System.out.println(Arrays.toString(mass1));

        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) { // 2 0 1 4 58 7 1
                if (mass1[j]<mass1[i]){
                    k = mass1[j];
                    mass1[j]=mass1[i];
                    mass1[i]=k;
                    howManySwaps += 1;
                }
            }
        }

        System.out.println(Arrays.toString(mass1));
        System.out.println("Было(а) сделано(а) " + howManySwaps + " перестановок(а/и)");
    }
}