package com.company;

import java.util.Scanner;

public class Circle {

    public double x, y, z;

    public void printCircle() {
        System.out.println("x " + x + "y " + y + "Z " + z);
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;

    }

    public void zoomCircle(double k) {
        k += z;
    }
    public Circle(){
        System.out.println("Enter to number");
        Scanner scanner =new Scanner(System.in);
        x = scanner.nextDouble();
        System.out.println("Enter to number");

        y = scanner.nextDouble();
        System.out.println("Enter to number");

        z = scanner.nextDouble();
    }

}
