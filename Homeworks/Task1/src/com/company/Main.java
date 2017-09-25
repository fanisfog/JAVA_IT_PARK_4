package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int scn; //Scaner
        String first = "Введите первое число: ";
        String second = "Введите второе число: ";
        System.out.println("Для выхода из программы введите 0");
        System.out.println("Выберите действие: \n" + "1. Сумма чисел \n" + "2. Разность чисел \n" + "3. Произведение чисел \n");
        Scanner in = new Scanner(System.in);
        while (true) {
            switch (scn = in.nextInt()) {
                case 0:
                    System.exit(0);
                    System.out.println("Вы вышли из программы, для начало начало нажмите Shift+F10 \n");
                case 1:
                    System.out.print(first);
                    int x = in.nextInt();
                    System.out.print(second);
                    int y = in.nextInt();
                    int z = x + y;
                    System.out.println("Сумма = " + z);
                    System.out.println("Выберите другое действие: \n" + "1. Сумма чисел \n" + "2. Разность чисел \n" + "3. Произведение чисел \n");
                    break;
                case 2:
                    System.out.print(first);
                    x = in.nextInt();
                    System.out.print(second);
                    y = in.nextInt();
                    z = x - y;
                    System.out.println("Разность =  " + z);
                    System.out.println("Выберите другое действие: \n" + "1. Сумма чисел \n" + "2. Разность чисел \n" + "3. Произведение чисел \n");
                    break;
                case 3:
                    System.out.print(first);
                    x = in.nextInt();
                    System.out.print(second);
                    y = in.nextInt();
                    z = x * y;
                    System.out.println("Произведение =  " + z);
                    System.out.println("Выберите другое действие: \n" + "1. Сумма чисел \n" + "2. Разность чисел \n" + "3. Произведение чисел \n");
                    break;
                default:
                    if (scn <= 4 | scn >= -1)
                        System.out.println("Введите число от 1 до 3");
                    break;

            }
        }


    }
}
