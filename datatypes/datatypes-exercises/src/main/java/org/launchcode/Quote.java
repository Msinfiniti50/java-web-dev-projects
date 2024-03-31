package org.launchcode;
import java.util.Scanner;

public class Quote {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, "
                + "and of having nothing to do: once or twice she had peeped into the book her sister "
                + "was reading, but it had no pictures or conversations in it, 'and what is the use" +
                " of a book, though Alice 'without pictures or conversation?'";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a search term:");
        String searchTerm = scanner.nextLine();
        scanner.close();

        if (searchTerm.trim().isEmpty()) {
            System.out.println("Search term cannot be empty!");
            return;
        }

        String lowerCaseText = text.toLowerCase();
        String lowerCaseSearchTerm = searchTerm.toLowerCase();

        if (lowerCaseText.contains(lowerCaseSearchTerm)) {
            System.out.println("Search term found!");
            int index = lowerCaseText.indexOf(lowerCaseSearchTerm);
            int length = lowerCaseSearchTerm.length();
            String modifiedSentence = lowerCaseText.replace(lowerCaseSearchTerm,  "");
            System.out.println("Your search term first appears at index " + index + ", Your term  is " + length + " characters long.");
        } else {
            System.out.println("Search term not found!");
        }
    }

}

