package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int time;
        int numberOfClient;
        int timeOfWaitingInMinutes;
        int timeOfWaitingInHours = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер очереди");
        size = scanner.nextInt();
        System.out.println("Введите время обслуживания в минутах");
        timeOfWaitingInMinutes = scanner.nextInt();

        int[] queue = new int[size];
        for (int i = 0; i < size; i++) {
            queue[i] = i + 1;
        }

        System.out.println("Время ожидания какого покупателя подсчитать? Введите его номер в очереди.");
        numberOfClient = scanner.nextInt();
        timeOfWaitingInMinutes = (numberOfClient - 1) * timeOfWaitingInMinutes;

        while ((timeOfWaitingInMinutes - 60) >= 0) {
            timeOfWaitingInMinutes = timeOfWaitingInMinutes - 60;
            timeOfWaitingInHours = timeOfWaitingInHours + 1;
        }

        if (numberOfClient == 1) {
            System.out.println("Первый человек в очереди уже обслуживается");
        } else {
            System.out.println("Время ожидания покупателя под номером " + numberOfClient + " равно " + timeOfWaitingInHours + " час(а/ов) " + timeOfWaitingInMinutes + " минут(а/ы)");
        }
    }
}
