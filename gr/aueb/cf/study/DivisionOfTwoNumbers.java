package gr.aueb.cf.study;

import java.util.Scanner;

public class DivisionOfTwoNumbers {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.println("Please enter a number");

        // Read and store the first number
        int num1 = scanner.nextInt();


        // Promt the user to input the second number
        System.out.println("Please enter a second number");

        // Read and store the second number
        int num2 = scanner.nextInt();

        //Calculate the division of num1 and num2
        int div = num1 / num2;


        // Create a blank line for seperation
        System.out.println();

        // Display the result of the division
        System.out.println("Div is  : " + div);



    }
}
