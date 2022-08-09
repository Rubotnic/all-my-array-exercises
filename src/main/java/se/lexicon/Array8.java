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
            int numbers[] = {20,20,40,20,30,40,50,60,50};
            System.out.print("Array: ");

            for (int i=0; i<numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            for (int i=0; i<numbers.length; i++) {

                for (int j=i; j<numbers.length; j++) {

                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            for (int i=0; i<numbers.length; i++) {
            }
            System.out.print('\n' + "Array without duplicate values: ");

            int b=0;
            numbers[b] = numbers[0];

            for (int i=0; i<numbers.length; i++)
            {
                if (numbers[b] != numbers[i])
                {
                    b++;
                    numbers[b] = numbers[i];
                }
            }
            for (int i=0; i<=b; i++)
            {
                System.out.print(numbers[i]+ " ");
            }
        }
    }
}
