// Write a program to find factorial of a number. (Using Loop)

import java.util.Scanner;
public class Factorial_Loop{
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        // System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
        
    }
}