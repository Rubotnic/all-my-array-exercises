package se.lexicon;
/*
8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
Expected output:
Array: 20 20 40 20 30 40 50 60 50
Array without duplicate values: 20 40 30 50 60
 */
public class Array8 {
    public void exerEight() {

        {
            int array[] = {20,20,40,20,30,40,50,60,50};
            System.out.println();
            System.out.print("Array: ");
            for (int i = 0; i<array.length; i++)
            {
                System.out.print(array[i]+"\t");
            }
            for (int i=0; i<array.length; i++)
            {
                for (int j=i; j<array.length; j++)
                {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            for (int i=0; i<array.length; i++)
            {
            }
            System.out.print ("\nArray without duplicate values: ");

            int b=0;
            array[b] = array[0];

            for (int i=0; i<array.length; i++)
            {
                if (array[b] != array[i])
                {
                    b++;
                    array[b] = array[i];
                }
            }
            for (int i=0; i<=b; i++)
            {
                System.out.print(array[i]+"\t");
            }
        }
    }
}