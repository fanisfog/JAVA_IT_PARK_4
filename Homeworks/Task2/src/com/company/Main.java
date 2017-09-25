package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //В этой программе ввод пользователя не проверяется!=)

        int array[] = new int[100];
        int count = 0, choice, input;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМЕНЮ:" +
                    "1.Показать массив\n" +
                    "2.Добавить в начало\n" +
                    "3.Добавить в конец\n" +
                    "4.Удалить по позиции\n" +
                    "5.Выход");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Пустое хранилище!");
                        break;
                    }
                    System.out.println();
                    for (int i = 0; i < count; i++)
                        System.out.print(array[i] + " ");
                    System.out.println();
                    break;
                case 2:
                    if (count >= 100) {
                        System.out.println("Хранилище заполнено!");
                        break;
                    }
                    System.out.print("Введите число для добавления в начало: ");
                    input = scanner.nextInt();
                    for (int i = count; i > 0; i--) {
                        array[i] = array[i - 1];
                    }
                    array[0] = input;
                    count++;
                    break;
                case 3:
                    if (count >= 100) {
                        System.out.println("Хранилище заполнено!");
                        break;
                    }
                    System.out.print("Введите число для добавления в конец: ");
                    input = scanner.nextInt();
                    array[count] = input;
                    count++;
                    break;
                case 4:
                    if (count <= 0) {
                        System.out.println("Хранилище уже пустое!");
                        break;
                    }
                    System.out.print("Удалить из позиции: ");
                    input = scanner.nextInt();
                    if (input<0||input>99){
                        System.out.println("Неправильная позиция!!! Удаление не выполнено!");
                        break;
                    }else if (input>count-1){
                        System.out.println("Эта позиция пустая!");
                        break;
                    }
                    for (int i = input; i <= count; i++) {
                        array[i] = array[i + 1];
                    }
                    count--;
                    System.out.println("Позиция " + input + " удалена");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный ввод!");
                    break;
            }
        }


    }

}

