package gr.aueb.cf.study;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.println("Enter the first number: ");

        // Read and store the first number
        int num1 = scanner.nextInt();

        // Prompt the user to input the second number
        System.out.println("Enter the second number: ");

        // Read and store the second number
        int num2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display a blank line for seperation
        System.out.println();


        // Display the sum of the two nubmers
        System.out.println("Sum is: " + sum);
    }
}
