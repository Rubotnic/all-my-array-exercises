package se.lexicon;
/*
12. Write a program which will print the diagonal elements of two-dimensional array.
Expected output: 1 4 9
 */
public class Array12 {
    public void exerTwelve() {

        int[][] diagonal1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        diagonal1[0][0] = 1;
        diagonal1[0][1] = 2;
        diagonal1[0][2] = 3;
        diagonal1[1][0] = 2;
        diagonal1[1][1] = 4;
        diagonal1[1][2] = 6;
        diagonal1[2][0] = 3;
        diagonal1[2][1] = 6;
        diagonal1[2][2] = 9;

        for (int i=0; i<3; i++) {

            System.out.print(" "+ diagonal1[i][i]);

        }
    }
}