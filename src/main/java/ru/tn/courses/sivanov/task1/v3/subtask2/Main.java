package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество точек на передней грани первого кубика");
        int firstCube = 0;
        int secondCube = 0;

        try {
            firstCube = scanner.nextInt();
            while (firstCube <1 || firstCube>6){
                System.out.println("Игральный кубик имеет на каждой грани от 1 до 6 точек");
                System.out.println("Введите значение заного");
                firstCube = scanner.nextInt();
            }
            System.out.println("Введите количество точек на передней грани второго кубикa");
            secondCube = scanner.nextInt();
            while (secondCube <1 || secondCube>6){
                System.out.println("Игральный кубик имеет на каждой грани от 1 до 6 точек");
                System.out.println("Введите значение заново");
                secondCube = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Было введено не целое число, или не число вовсе");
            System.exit(0);
        }

        System.out.println(firstCube + "   " + secondCube);

        if (firstCube + secondCube >= 4 && firstCube + secondCube <=9){
            System.out.println("Для того, чтобы дверь открылась, нужно рядом с первыми двумя кубами вставить третий, с гранью с " + (10-(firstCube+secondCube)) + " точками");
        } else if (firstCube + secondCube >= 10) {
            System.out.println("Т.к. сумма двух вставленных кубов больше или равна десяти, придется вставить еще два куба, ведь по условию дверь откроется, если сумма трех кубов равна 10");
            int k = 10 - secondCube;
            int thirdCube = random.nextInt(k-2) + 1;
            int fourthCube = 10 - (secondCube + thirdCube);
            System.out.println("Для открытия двери можно вставить кубы с гранями: " + thirdCube + ", " + fourthCube);
        } else if (firstCube + secondCube < 4) {
            System.out.println("Т.к. сумма двух вставленных кубов больше или равна десяти, придется вставить еще два куба, ведь по условию дверь откроется, если сумма трех кубов равна 10");
            int k = 10 - secondCube;
            int thirdCube = random.nextInt(3) + 3;
            int fourthCube = 10 - (secondCube + thirdCube);
            System.out.println("Для открытия двери можно вставить кубы с гранями: " + thirdCube + ", " + fourthCube);
        }
    }
}
