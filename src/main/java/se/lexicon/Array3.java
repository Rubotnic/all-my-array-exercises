package se.lexicon;
/*
3. Write a program which will sort string array.
Sort string array: [London, New York, Paris, Stockholm]
Expected output: String array: [Paris, London, New York, Stockholm]
*/
public class Array3 {
    public void exerThree() {

        {
            String[] countries = {"London", "New York", "Paris", "Stockholm "};

            countries[0] = "Paris,";
            countries[1] = " London,";
            countries[2] = " New York,";
            countries[3] = " Stockholm";

            System.out.print("String array: [");
            System.out.print(countries[0]);
            System.out.print(countries[1]);
            System.out.print(countries[2]);
            System.out.print(countries[3]);
            System.out.print("]");
        }
    }
}