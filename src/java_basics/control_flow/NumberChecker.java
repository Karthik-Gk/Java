package java_basics.control_flow;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Odd or Even
        if(number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Sign checker
        int signCode;
        if(number < 0) signCode = 1;
        else if (number > 0) signCode = 2;
        else signCode = 0;

        switch (signCode) {
            case 1:
                System.out.println("Entered number is Negative");
                break;
            case 2:
                System.out.println("Entered number is Positive");
                break;
            case 0:
                System.out.println("Entered number is Zero");

        }
    }
}
