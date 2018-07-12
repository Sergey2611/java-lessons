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
        int highOfTree = scanner.nextInt() * 100;
        System.out.println("Введите положение улитки на дереве в сантиметрах");
        int snailFirstPosition = scanner.nextInt();

        while (snailFirstPosition <= 0 || snailFirstPosition > highOfTree) {
            System.out.println("Улитка должна быть на дереве \nВведите положение улитки заново");
            snailFirstPosition = scanner.nextInt();
        }

        int snailRealPosition = snailFirstPosition;
        int size = 30;
        int[] mass1 = new int[size];
        for (int i = 0; i < size; i++) {
            mass1[i] = random.nextInt(2);
            if (mass1[i] == 1) {
                snailRealPosition += 2;
            } else {
                snailRealPosition--;
            }
        }

        if (snailRealPosition > 0 && snailRealPosition < highOfTree) {
            System.out.println("Положение улитки через 30 дней - " + snailRealPosition + " см");
            if (snailRealPosition > snailFirstPosition) {
                System.out.println("Улитка поднялась на " + (snailRealPosition - snailFirstPosition) + " см");
            } else if (snailRealPosition == snailFirstPosition) {
                System.out.println("Улитка осталась на том же месте");
            } else if (snailRealPosition < snailFirstPosition) {
                System.out.println("Улитка спустилась на " + (snailFirstPosition - snailRealPosition) + " см");
            }
        } else if (snailRealPosition <= 0) {
            System.out.println("Улитка слезла с дерева");
        } else if (snailRealPosition >= highOfTree) {
            System.out.println("Улитка поднялась на верхушку дерева");
        }
    }
}