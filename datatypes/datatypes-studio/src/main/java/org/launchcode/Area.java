package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius ? ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println(String.format("The area of a circle of radius %.1f is: %.3f%n", radius, area));
    }
}
