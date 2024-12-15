package gr.aueb.cf.study;

import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input the first number
        System.out.println("Input first number");

        // Read and store the first number
        int fnumber = scanner.nextInt();

        // Prompt the user to input the second number
        System.out.println("Input second number");

        // Read and store the second number
        int snumber = scanner.nextInt();

        // Calculate the product of the two numbers and display the result
        System.out.println(fnumber + " x " + snumber + " = " + fnumber * snumber);


    }
}
