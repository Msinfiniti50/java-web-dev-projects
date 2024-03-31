package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of a rectangle?");
        int length = input.nextInt();
        System.out.println("What is the width of a rectangle?");
        int width = input.nextInt();

        int area = length * width;
        System.out.println("The area of the rectangle is: " + area + "sq ft");
    }
}
