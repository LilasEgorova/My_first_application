package ru.egorova.dz3;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class task4 {

          public static void main(String[] args) {
            Random random = new Random();
            Scanner in = new Scanner(System.in);

            int count = 0;
            int a = -1;
            int number = (int) (Math.random() * 101);
              System.out.print("Введите число от 0 до 100: \n" +"Если решите выйти раньше, нажмите любую букву\n");

            while (a != number) {
                boolean br = in.hasNextInt(); // прерывание по требованию
                if (!br) break;

                a = in.nextInt();
                int c = (Math.abs (a - number));

                if (c <= 10) {
                    System.out.println("Горячо");
                }
                if (c > 10) {
                    System.out.println("Холодно");
                }
                count++;
            }
            if (a == number)	{
                System.out.println("Поздравляю! Вы угадали совершенно точно!!!");

            }

        }
    }
