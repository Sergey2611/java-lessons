package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dollars;
        int numberOfBanks;
        Random random = new Random();
        System.out.println("Введите количество ваших долларов");
        dollars = scanner.nextInt();
        System.out.println("Введите количество банков в городе");
        numberOfBanks = scanner.nextInt();

        Bank[] arrBanks = new Bank[numberOfBanks];
        for (int i = 0; i < numberOfBanks; i++) {
            arrBanks[i] = new Bank((int) (random.nextFloat() * 10 + (random.nextInt(80))), "bank" + (i + 1));
        }

        Arrays.sort(arrBanks, Bank.CourseComparator);

        System.out.println("Сортировка по курсу:");
        for (int i = 0; i < numberOfBanks; i++) {
            System.out.println(arrBanks[i]);
        }

        System.out.println("Выгоднее всего обменивать деньги в банках(e):");
        for (int i = numberOfBanks; i > 0; i--) {
            if (arrBanks[numberOfBanks - 1].getCourse() == arrBanks[i - 1].getCourse()) {
                System.out.println(arrBanks[i - 1].getName());
            }
        }
        System.out.println("В данных(ом) банках(е) вы получите после обмена " + dollars + " долларов " + arrBanks[numberOfBanks - 1].exchange(dollars) + " рублей");
    }
}
