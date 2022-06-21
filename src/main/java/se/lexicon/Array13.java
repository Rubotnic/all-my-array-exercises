package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;
/*
13. Create two arrays with arbitrary size and fill one with random numbers.
Then copy over the numbers from the array with random numbers so that the even
numbers are located in the rear (the right side) part of the array and the odd
numbers are located in the front part (the left side).
 */
public class Array13 {
    public void exerThirteen() {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int oddNumbers = array1.length;
        int evenNumbers = array2.length;
        int [] result = new int[oddNumbers + evenNumbers];

        System.arraycopy(array1, 0, result, 0, oddNumbers);
        System.arraycopy(array2, 0, result, oddNumbers, evenNumbers);
        System.out.println();

        System.out.println(Arrays.toString(result));
    }
}