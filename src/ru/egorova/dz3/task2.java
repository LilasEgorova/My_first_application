package ru.egorova.dz3;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        int seconds;
        System.out.println ("Введите количество секунд:");
        Scanner in = new Scanner(System.in);
        seconds = in.nextInt();

        int minutes = (seconds%3600)/60;
        int seconds1 = seconds%60;
        int hours = seconds/3600;
        System.out.println("Результат конвертации секунд в часы:");
        System.out.println(hours +"ч "+minutes+"мин "+seconds1+"сек ");
    }
}
