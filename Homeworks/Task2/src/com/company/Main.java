package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int array[] = new int[100];
        int count = 0;
        int number, menu;
        Scanner scanner = new Scanner(System.in);


        System.out.println("1.Показать массив!\n" + "2.Добавить элемент в начало!\n" + "3.Добавить элемент в конец!\n" + "4.Удалить элемент по позиции!\n" + "5.Выход!\n");

        while (true) {
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    if (count == 0) {
                        System.out.println("Массив пуст!");
                        break;
                    }
                    System.out.println();
                    for (int i = 0; i < count; i++)
                        System.out.print(array[i] + " ");
                    System.out.println();
                    break;
                case 2:
                    if (count >= 100) {
                        System.out.println("Заполнен!");
                        break;
                    }
                    System.out.print("Введите число для добавления в начало: ");
                    number = scanner.nextInt();
                    for (int i = count; i > 0; i--) {
                        array[i] = array[i - 1];
                    }
                    array[0] = number;
                    count++;
                    break;
                case 3:
                    if (count >= 100) {
                        System.out.println("Массив заполнен!");
                        break;
                    }
                    System.out.print("Введите число для добавления в конец: ");
                    number = scanner.nextInt();
                    array[count] = number;
                    count++;
                    break;
                case 4:
                    if (count <= 0) {
                        System.out.println("Пусто!");
                        break;
                    }
                    System.out.print("Удалить из позиции: ");
                    number = scanner.nextInt();
                    if (number < 0 || number > 99) {
                        System.out.println(" Элемент не удалён!");
                        break;
                    } else if (number > count - 1) {
                        System.out.println("Этот элемент пуст!");
                        break;
                    } else if (number == count - 1) {
                        count--;
                    } else {
                        for (int i = number; i < count; i++) {
                            array[i] = array[i + 1];
                        }
                        count--;

                    }
                    System.out.println("Элемент " + number + " удален");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод данных! Введите доступые значения!");
                    break;
            }
        }
    }

}



