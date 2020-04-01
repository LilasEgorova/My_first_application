package ru.egorova.dz4;

import java.util.Scanner;

public class task4geom {

    public static void main(String[] args) {

        System.out.println("Создадим геометрическую прогрессию по формуле: Bn=B1*Q^(N-1),\n" +
                "где N - количество членов прогрессии, Q - знаменатель прогрессии \n" +
                "Вводимые данные должны отвечать условиям: значения B1, N, Q не равны НУЛЮ! \n" +
                "А значение N - только положительное \n" + "Для завершения нажмите любую букву.");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите значение первого члена прогрессии В1 = ");
            boolean br = in.hasNextInt(); // завершение расчётов
            if (!br) break;
            int b1 = in.nextInt();
            if (b1 == 0) {
                System.out.println("Нарушено условие! Начните заново.");
                continue;
            }
            System.out.print("Задайте количество членов прогрессии N = ");
            int n = in.nextInt();
            if (n <= 0) {
                System.out.println("Нарушено условие! Попробуйте сначала.");
                continue;
            }
            System.out.print("Введите знаменатель прогрессии Q = ");
            int q = in.nextInt();
            if (q == 0) {
                System.out.println("Нарушено условие! Будьте внимательны.");
                continue;
            }
            for (int i = 1; i <= n; i++) {
                double denominator = i - 1;
                int GeomProgress = (int) (b1 * (Math.pow(q, denominator)));
                System.out.printf("%4d", GeomProgress);
            }
            System.out.println();
            System.out.println("Сумма геометрической прогрессии составляет: ");
            int GeomSum = (int) ((b1 * (Math.pow(q, n) - 1)) / (q - 1));
            System.out.println(GeomSum);
        }
    }
}