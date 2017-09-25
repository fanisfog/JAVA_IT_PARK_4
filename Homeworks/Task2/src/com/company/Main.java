package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        int count = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Показать массив - выводит только count-элементов");
        System.out.println("2.Добавить в начало");
        System.out.println("3.Добавить в конец");
        System.out.println("4.Удалить по позиции");
        System.out.println("5.Выход");

        while (true)
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Введите массив из чисел");
                    n = scanner.nextInt();
                    numbers[count] = 1;
                    count++;
                    break;
            }
    }
  
}

