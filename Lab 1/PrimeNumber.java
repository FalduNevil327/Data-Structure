// Write a program to check whether a number is prime or not.

import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Given number is not Prime");
        } else {
            System.out.println("Given number is prime");
        }
    }
}