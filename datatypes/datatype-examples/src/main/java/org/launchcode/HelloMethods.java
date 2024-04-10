package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("sp");
        System.out.println(message);
    }

    public class Message {

           public static String getMessage(String lang) {

                if (lang.equals("LaunchCode")) {
                return "Yass! You Rock!";
            } else if (lang.equals("Java")) {
                return "Hello Coder!";
            }
            return "Hello World, I'm a Coder!";
        }}}




