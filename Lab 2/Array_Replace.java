// Read n numbers in an array then read two different numbers, replace 1st number with 2nd number in an array and print its index and final array.

import java.util.Scanner;
public class Array_Replace{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter N2 : ");
        int n2 = sc.nextInt();

       int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n1) {
                arr[i] = n2;
                System.out.println("Number " + n1 + " is found at index " + i);
            }
        }
        System.out.println("New Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}