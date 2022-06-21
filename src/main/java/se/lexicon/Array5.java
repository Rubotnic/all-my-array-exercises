package se.lexicon;
/*
5.Create a two-dimensional string array [2][2].
Assign values to the 2D array containing any Country and City.
Expected output:
France Paris
Sweden Stockholm
*/
public class Array5{
    public void exerFive() {

        String[][] countries = new String[2][2];

        countries[0][0] = "France ";
        countries[0][1] = "Paris";
        countries[1][0] = "Sweden ";
        countries[1][1] = "Stockholm";

        int i=0;

        while (i<countries.length) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]);

                if (j == countries[i].length - 1) {
                    System.out.println();
                }
            }
            i++;
        }
    }
}