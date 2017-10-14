package com.company;

public class Program {

    /**
     * @param c
     * @return
     */
    public static boolean isLetter(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    /**
     * @param c
     * @return
     */
    public static boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    /**
     * @param c
     * @return
     */
    public static boolean isUpper(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    /**
     * @param c
     * @return
     */
    public static boolean isLower(char c) {

        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    /**
     * @param c
     * @return
     */
    public static boolean isWriteSpace(char c) {
        if ((c == ' ') || (c == '\n') || (c == '\t')) {
            return true;
        }
        return false;
    }

    /**
     * @param number
     * @return value
     */
    public static int parse(char[] number) {
        int value = 0;
        for (char c : number) {
            if (isDigit(c)) {
                value = value * 10 + c - '0';
            }
        }
        return value;
    }

}


