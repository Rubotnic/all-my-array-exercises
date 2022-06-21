package se.lexicon;
/*
4. Write a program which will copy the elements of one array into another array.
Expected output:
Elements from first array: 1 15 20
Elements from second array: 1 15 20
*/
public class Array4 {

    public void exerFour() {

        String text1 = "Elements from first array: 1 15 20";
        System.out.println();
        System.out.println(text1);

        String replaceText = text1.replace("first","second");
        System.out.println(replaceText);
    }
}