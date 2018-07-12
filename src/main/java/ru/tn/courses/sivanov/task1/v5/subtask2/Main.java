package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите высоту дерева в метрах");
        int high = scanner.nextInt() * 100;
        System.out.println("Введите положение улитки на дереве в сантиметрах");
        int firstposition = scanner.nextInt();

        while (firstposition <= 0 || firstposition > high) {
            System.out.println("Улитка должна быть на дереве \nВведите положение улитки заново");
            firstposition = scanner.nextInt();
        }

        int position = firstposition;
        int size = 30;
        int[] mass1 = new int[size];
        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(2);
            if (mass1[i] == 1) {
                position += 2;
            } else {
                position--;
            }
        }

        if (position > 0 && position < high) {
            System.out.println("Положение улитки через 30 дней - " + position + " см");
            if (position > firstposition) {
                System.out.println("Улитка поднялась на " + (position - firstposition) + " см");
            } else if (position == firstposition) {
                System.out.println("Улитка осталась на том же месте");
            } else if (position < firstposition) {
                System.out.println("Улитка спустилась на " + (firstposition - position) + " см");
            }
        } else if (position <= 0) {
            System.out.println("Улитка слезла с дерева");
        } else if (position >= high) {
            System.out.println("Улитка поднялась на верхушку дерева");
        }
    }
}