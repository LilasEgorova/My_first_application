package ru.egorova.dz4;

import java.util.Scanner;

public class task4 {

        public static void main(String[] args) {

            System.out.println("Создадим арифметическую прогрессию по формуле: An=A1+D(N-1),\n" +
                    "где N - количество членов прогрессии, D - разность прогрессии\n" +
                    "Для завершения введите любую букву.\n");

            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите первое число прогрессии A1 = ");
                boolean br = in.hasNextInt(); // завершение расчётов
                if (!br) break;
                int a1 = in.nextInt();
                System.out.print("Введите количество членов прогрессии N = ");
                int n = in.nextInt();
                if (n <= 0) {
                    System.out.println("Количество не должно быть нулём или числом отрицательным! Попробуйте ещё.");
                    continue;
                }
                System.out.print("Введите разность прогрессии D = ");
                int d = in.nextInt();
                for (int i = 1; i <= n; i++) {
                    int arithmProgress = (a1 + d * (i - 1));
                    System.out.printf("%4d", arithmProgress);
                }
                System.out.println();
                System.out.println("Сумма прогрессии составляет: ");
                int arithmSum = ((2 * a1 + d * (n - 1))) / 2 * n;
                System.out.println(arithmSum);
            }
        }
}
