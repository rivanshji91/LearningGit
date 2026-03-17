package org.example;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;     // get last digit
            reversed = reversed * 10 + digit;
            num = num / 10;           // remove last digit
        }

        // Check palindrome
        if (original == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}