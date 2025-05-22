package basics.variables;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int age = 2025 - birthYear;

        System.out.println("Hi " + name + ", your current age is " + age);
    }
}
