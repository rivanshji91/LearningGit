package org.example;


    import java.util.Scanner;

    public class ReverseWord {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String input = sc.nextLine();

            String reversed = new StringBuilder(input).reverse().toString();

            System.out.println("Reversed word: " + reversed);
        }
    }

