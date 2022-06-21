package se.lexicon;
/*
2. Create a program and create a method with name ‘indexOf’ which will
find and return the index of an element in the array.
If the element doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.
 */
public class Array2 {

    public static int indexOf(int array[], int b) {

        if (array == null) {
            return -1;
        }

        int leng = array.length;
        int i = 0;

        while (i < leng) {

            if (array[i] == b) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public void exerTwo() {
        int[] myArray = {3, 4, 5, 6, 7};

        System.out.println();
        System.out.println("Index position of number 5 is: " + indexOf(myArray, 5));
        System.out.println("Index position of number 10 is: " + indexOf(myArray, 10));
    }
}