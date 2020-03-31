package ru.egorova.dz3;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        int Count;
        int Price;
        System.out.println("Введите количество литров топлива (л)");
        Scanner in = new Scanner(System.in);
        Count = in.nextInt ();
        System.out.println("Введите цену за литр топлива (руб.)");
        Price = in.nextInt ();
        int Total = Count*Price;
        System.out.println("Стоимость топлива составляет (руб.)");
        System.out.println(Total);

    }
}