package ru.egorova.dz3;

import java.util.Scanner;

public class task3 {

        public static void main(String[] args) {
            double Tax;
            double Salary;
            System.out.println("Введите заработную плату до вычета НДФЛ (руб.)");
            Scanner in = new Scanner(System.in);
            Salary = in.nextInt();
            Tax = (Salary*13)/100;
            System.out.println("Налог на доходы физических лиц (НДФЛ) составляет " +Tax+ " рублей");
            double Total = Salary-Tax;
            System.out.println("Заработная плата к выдаче составляет (руб.)");
            System.out.println(Total);



        }
    }

