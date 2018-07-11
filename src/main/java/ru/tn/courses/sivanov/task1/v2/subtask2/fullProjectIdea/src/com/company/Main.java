package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dlr;
        int n;
        int crs;
        Random random = new Random();
        System.out.println("Введите количество ваших долларов");
        dlr = scanner.nextInt();
        System.out.println("Введите количество банков в городе");
        n = scanner.nextInt();

        Bank[] arrBanks = new Bank[n];
        for (int i = 0; i < n; i++) {
            crs = (int) ((random.nextFloat()*10 + (random.nextInt(80))));
                arrBanks[i] = new Bank(crs, "bank" + (i+1));
        }

        Arrays.sort(arrBanks, Bank.CourseComparator);

        System.out.println("Сортировка по курсу:");
        for (int i = 0; i < n; i++) {
            System.out.println(arrBanks[i]);
        }

        System.out.println("Выгоднее всего обменивать деньги в банках(e):");
        for (int i = n; i > 0; i--) {
            if (arrBanks[n-1].getCourse() == arrBanks[i-1].getCourse()) {
                System.out.println(arrBanks[i-1].getName());
            }
        }
        System.out.println("В данных(ом) банках(е) вы получите после обмена " + dlr + " долларов " + arrBanks[n-1].exchange(dlr) + " рублей");
    }
}