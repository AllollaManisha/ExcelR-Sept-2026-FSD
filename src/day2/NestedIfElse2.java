/*
 * percentage >= 75,000   Excellent
 * percentage >= 60,000   V Good
 * percentage >= 50,000    Good
 * percentage >= 40,000     OK
 * percentage < 25000    Not OK
 */


package day2;

import java.util.Scanner;

public class NestedIfElse2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your percentage");
        double percentage = sc.nextDouble();

        if (percentage >= 75000) {
            System.out.println("Excellent");
        }
        else if (percentage >= 60000) {
            System.out.println("V Good");
        }
        else if (percentage >= 50000) {
            System.out.println("Good");
        }
        else if (percentage >= 40000) {
            System.out.println("OK");
        }
        else if (percentage < 25000) {
            System.out.println("Not OK");
        }

        System.out.println("Thank You!!!");
    }
}