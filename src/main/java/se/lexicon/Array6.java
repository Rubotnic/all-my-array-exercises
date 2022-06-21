package se.lexicon;
/*
6. Write a program which will set up an array
to hold the next values in this order: 43, 5, 23, 17, 2, 14
and print the average of these 6 numbers.
Expected output: Average is: 17.3
*/
public class Array6 {

    public void exerSix() {

        int[] numbers = {43, 5, 23, 17, 2, 14};

        float sum = 0;

        int i=0;

        while(i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        float average = (sum / numbers.length);
        System.out.println("The average of this 6 numbers is " + average + ".");
    }
}