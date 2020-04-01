package ru.egorova.dz4;

public class task3 {

    public static void main(String[] arg) {

        System.out.println("Таблица умножения");

        for (int x = 1; x < 11; x++) {
                for (int y = 1; y < 11; y++) {
                    System.out.print(x * y + "  ");
                }
                System.out.println("");
            }
        }
    }

