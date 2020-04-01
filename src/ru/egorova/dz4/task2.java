package ru.egorova.dz4;

import java.util.Scanner;

public class task2 {

    public static void main(String[] arg) {
        System.out.println("Давайте проанализируем любое  число!");
        System.out.println("Введите целое число:");

        while (true) {
            Scanner in = new Scanner(System.in);
            boolean btest = in.hasNextInt();
            if (!btest) {
                System.out.println("Число должно быть ЦЕЛЫМ! Попробуйте ещё раз.");
                continue;
            }
            int number1 = in.nextInt();
                if (number1 == 0) {
                System.out.println("Это цифра НОЛЬ!");
                break;
            }
            if (number1 < 0) System.out.println("Данное число ОТРИЦАТЕЛЬНОЕ");
            else System.out.println("Данное число ПОЛОЖИТЕЛЬНОЕ");

            double number2;
            number2 = number1 % 2;
            if (number2 == 0) System.out.println("И является ЧЁТНЫМ!");
            else System.out.println("И является НЕЧЁТНЫМ!");
            in.close();
            break;
        }
    }
}
