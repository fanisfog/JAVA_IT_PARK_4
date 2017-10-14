package com.company;

import static com.company.Program.*;

public class Main {


    public static void main(String[] args) {
        char number[] = {'1', '4', '5', '6'};
        int x = parse(number);
        System.out.println(x);
        System.out.println(isLetter('t'));
        System.out.println(isDigit('8'));
        System.out.println(isLower('Y'));
        System.out.println(isUpper('i'));
        System.out.println(isWriteSpace(' '));


    }


}
