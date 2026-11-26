package simplecalculator;

import java.util.Scanner;


public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");

        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
    
    
}
