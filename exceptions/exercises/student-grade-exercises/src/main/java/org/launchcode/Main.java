package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Divide(  10, 2 ));
        } catch
        (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        studentFiles.forEach((k, v) -> System.out.println(k + ": " + CheckFileExtension(v)));
        // Test out your CheckFileExtension() function!
    }

    public static double Divide(int x, int y)
    {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) x / y;
    }

    public static boolean CheckFileExtension(String fileName) {
        return fileName.toLowerCase().endsWith("java"); }
    }

