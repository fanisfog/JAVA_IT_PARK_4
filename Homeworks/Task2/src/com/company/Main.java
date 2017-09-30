package com.company;

import java.util.Scanner;


public class Main {
    static int array[] = new int[100];
    static int count = 0;
    static int number, menu; //input
    static Scanner scanner = new Scanner(System.in);
    static String menu_out = "0.Сортировка\n" + "1.Показать массив!\n" + "2.Добавить элемент в начало!\n" + "3.Добавить элемент в конец!\n" + "4.Удалить элемент по позиции!\n" + "5.Выход!\n";

<<<<<<< HEAD
    static  void menu() {
        System.out.println(menu_out);
    }

     static void checkArray() {
=======
    static void menu() {
        System.out.println(menu_out);
    }

    public static void checkArray() {
>>>>>>> c58eb84175059be102be8c4f68baaa67b302aa1e
        if (count == 0) {
            System.out.println("Массив пуст! Введите 2 для начало заполнения массива!");
        }
        for (int i = 0; i < count; i++) {
            System.out.print("Ячейка " + i + " содержит число " + array[i] + "\n");
        }
        System.out.println(menu_out);
    }

    static void addNumdersToBegin() {
        if (count >= 100) {
            System.out.println("Заполнен!");
        }
        System.out.print("Введите число для добавления в начало: ");
        number = scanner.nextInt();
        for (int i = count - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = number;
        count++;
        System.out.println("В ячейке " + count + " сохранилась " + number + "\n" + menu_out);
    }

    static void addNumdersToBack() {
        if (count >= 100) {
            System.out.println("Массив заполнен!");

        }
        System.out.print("Введите число для добавления в конец: ");
        number = scanner.nextInt();
        array[count] = number;
        count++;
        System.out.println("В конце ячейки " + count + " сохранилась " + number + "\n" + menu_out);
    }

    static void deleteNumbersOfIndex() {
        if (count <= 0) {
            System.out.println("Удалять нечего! Сперва заполните массив!");
        }
        System.out.print("Удалить из позиции: ");
        number = scanner.nextInt();
        if (number < 0 || number > 99) {
            System.out.println(" Элемент не удалён!");
        } else if (number > count--) {
            System.out.println("Этот элемент пуст!");
        } else if (number == count - 1) {
            count--;
<<<<<<< HEAD
=======

        } else {
            for (int i = number; i < count; i++) {
                array[i] = array[i + 1];
            }
            count--;
        }
        System.out.println("Элемент " + number + " удален\n" + menu_out);
    }

    static void exitApp() {
        System.out.print("ВЫХОД");
        System.exit(0);
    }

    static void errorApp() {
        System.out.println("Некорректный ввод данных! Введите доступные значения!");
    }

    static void sortArray() {
        for (int i = count; i < array.length; i++) {
            int n = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int leftNumber = array[j];
                if (n < leftNumber) {
                    array[i] = leftNumber;
                    array[j] = n;
                } else
                    break;
            }
        }
        System.out.println("Массив отсортирован \n" + menu_out);
  }


    public static void main(String[] args) {


        menu();
>>>>>>> c58eb84175059be102be8c4f68baaa67b302aa1e

        } else {
            for (int i = number; i < count; i++) {
                array[i] = array[i + 1];
            }
            count--;
        }
        System.out.println("Элемент " + number + " удален\n" + menu_out);
    }

    static void exitApp() {
        System.out.print("ВЫХОД");
        System.exit(0);
    }

    static void errorApp() {
        System.out.println("Некорректный ввод данных! Введите доступные значения!");
    }

    static void sortArray() {
        for (int i = 1; i < count; i++) {
            for (int k = 0; k < count - i; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }

            System.out.println("Массив отсортирован \n" + menu_out);
        }
    }


    public static void main(String[] args) {
        menu();
        while (true) {
<<<<<<< HEAD
            switch (menu = scanner.nextInt()) {
=======
            menu = scanner.nextInt();
            switch (menu) {
>>>>>>> c58eb84175059be102be8c4f68baaa67b302aa1e
                case 0:
                    sortArray();
                    break;
                case 1:
                    checkArray();
                    break;
                case 2:
                    addNumdersToBegin();
                    break;
                case 3:
                    addNumdersToBack();
                    break;
                case 4:
                    deleteNumbersOfIndex();
                    break;
                case 5:
                    exitApp();
                    break;
                default:
                    errorApp();
                    break;
            }
        }
    }


}



