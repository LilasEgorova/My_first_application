package ru.egorova.dz4;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args){

        System.out.println("Давайте найдём минимальное из двух введенных Вами чисел!");

        double number1, number2;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        number1 = in.nextDouble();

        System.out.println("Введите второе число:");
        number2 = in.nextDouble();

        if (number1 < number2)
            System.out.println("Минимальным является число \n" + number1);
        else
            System.out.println("Минимальным является число \n" + number2);
    }
}