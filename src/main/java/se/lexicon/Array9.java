package se.lexicon;
/*
9. Write a method which will add elements in an array.
Remember that arrays are fixed in size
so you need to come up with a solution to “expand” the array.
 */
import java.util.Arrays;
public class Array9 {

    public void exerNine() {

        int[] array1 = {1,2,3};
        int[] array2 = Arrays.copyOf(array1,array1.length + 2);

        array2 [3] = 4;
        array2 [4] = 5;

        for (int number :  array2) {
            System.out.println();
            System.out.println(number);
        }
    }
}