package se.lexicon;
/*
Write a program which will set up an array to hold 10 numbers
and print out only the uneven numbers.
Expected output:
Array: 1 2 4 7 9 12
Odd Array: 1 7 9
*/
public class Array7 {
    public void exerSeven() {

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 12};

        System.out.print("Array: ");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[1] + " ");
        System.out.print(numbers[3] + " ");
        System.out.print(numbers[6] + " ");
        System.out.print(numbers[8] + " ");
        System.out.println(numbers[9] + " ");

        System.out.print("Odd Array: ");
        System.out.print(numbers[0] + " ");
        System.out.print(numbers[6] + " ");
        System.out.print(numbers[8] + " ");
    }
}