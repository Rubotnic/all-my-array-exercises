package se.lexicon;
/*
4. Write a program which will copy the elements of one array into another array.
Expected output:
Elements from first array: 1 15 20
Elements from second array: 1 15 20
*/
public class Array4 {

    public void exerFour() {
        
        String[] text1 = {"Elements from first array: 1 15 20"};
        String[] text2 = Arrays.copyOf(text1, text1.length + 1);
        text2[1] = "Elements from second array: 1 15 20";

        for (String texts : text2) {
            System.out.println(texts);
    }
}
