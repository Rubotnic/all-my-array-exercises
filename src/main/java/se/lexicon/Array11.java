package se.lexicon;

import java.util.Scanner;
/*
11. Write a program that ask the user for an integer and repeat that question until user
give you a specific value that user already has been told about as a message in your program.
Store these values in an array and print that array. After that reverse the array elements
so that the first element becomes the last element, the second element becomes the second to last element, etc.
Do not just reverse the order in which they are printed. You need to change the way they are stored in the array.
 */
public class Array11 {
    public void exerEleven() {

        int count,i;
        int input[] = new int [100];
        int output[] = new int [100];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 3 to give 3 elements numbers:");
        count = scan.nextInt();

        System.out.println(count + " elements are now available to fill in with numbers.");
        System.out.print("Choose now "+ count + " values the elements should have.\n");
        for (i=0; i<count; i++) {
            input[i] = scan.nextInt();
        }
        for (i=0; i<count; i++) {
            output[i] = input[count - i - 1];

            System.out.println(output[i] + " ");
        }
    }
}