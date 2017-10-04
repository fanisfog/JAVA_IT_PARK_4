package com.company;


import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        ArrayList lists[] = new ArrayList[5];
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();

        while (true) {
            createMenu();

           

    private static void createMenu() {
        System.out.println("Меню:");
        System.out.println("1.Создать список (0..4)");
        System.out.println("2.Показть все списки");
        System.out.println("3.Работа со списком");
        System.out.println("4.Выход");
    }


}