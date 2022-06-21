package se.lexicon;
/*
10. Write a program which will represent multiplication table stored in multidimensional array.
Hint: You have two-dimensional array with values
[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 */
public class Array10 {

    public void exerTen() {

        int multi[][] = new int[10][10];
        int row=1,column=1;

        for (int i=0; i<multi.length; i++) {
            for (int j=0; j<multi[i].length; j++) {
                multi[i][j] = row*column;
                column=column + 1;
            }
            row = row + 1;
            column = 1;
        }
        for (int i=0;  i<multi.length; i++){
            for (int j=0; j<multi[i].length; j++){
                System.out.print(" "+multi[i][j]+"\t| ");
            }
            System.out.print("\n");
        }
    }
}