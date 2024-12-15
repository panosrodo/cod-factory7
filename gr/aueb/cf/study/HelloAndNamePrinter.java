package gr.aueb.cf.study;

import java.util.Scanner;

public class HelloAndNamePrinter {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Promt the user to input their first name
        System.out.println("Please enter your first name: ");
        String fname = scanner.next();

        // Prompt the user to input their last name.
        System.out.println("Please enter your last name: ");

        // Output a greeting message with the user's full name
        String lname = scanner.next();
        System.out.println("Hello \n" + fname + " " + lname);
    }
}
