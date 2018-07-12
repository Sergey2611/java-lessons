package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sizeOfArray = 30;
        int counterOfNulls = 0;
        int[] mass1 = new int[sizeOfArray];
        Random random = new Random();

        for (int i = 0; i < sizeOfArray; i++) {
            mass1[i] = random.nextInt(5);
            if (mass1[i] == 0) {
                counterOfNulls++;
            }
        }
        int[] mass2 = new int[counterOfNulls];
        counterOfNulls = 0;

        for (int i = 0; i < sizeOfArray; i++) {
            if (mass1[i] == 0) {
                mass2[counterOfNulls] = i + 1;
                counterOfNulls++;
            }
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(mass1));

        if (counterOfNulls == 0) {
            System.out.println("В исходном массиве нулей нет");
        } else {
            System.out.println("Массив с позициями нулей");
            System.out.println(Arrays.toString(mass2));
        }
    }
}

