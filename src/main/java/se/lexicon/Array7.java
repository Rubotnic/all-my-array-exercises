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

        for(int arrayNumber: numbers)
        System.out.print(arrayNumber + " ");
        System.out.print('\n' + "Odd Array: " );

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
