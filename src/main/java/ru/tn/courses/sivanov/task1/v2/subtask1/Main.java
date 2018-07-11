package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 30;
        int k = 0;
        int[] mass1 = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            mass1[i] = random.nextInt(5);
            if (mass1[i] == 0) {
                k++;
            }
        }
        int[] mass2 = new int[k];
        k = 0;

        for (int i = 0; i < n; i++) {
            if (mass1[i] == 0){
                mass2[k] = i+1;
                k++;
            }
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        if (k==0){
            System.out.println("В исходном массиве нулей нет");
        } else {
            System.out.println("Массив с позициями нулей");
            System.out.println(Arrays.toString(mass2));
        }
    }
}

