package datatypes;

public class ArraysPractice {
    public static void main(String[] args) {

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        for (double e1: myList){

            System.out.println("Value e1 equals " + e1);


         }

        int[] intArray = {1,2,3,4};

        for (int e2: intArray){

            System.out.println("Value of e2 equals " + e2);
        }

        String[] strArray = {"Esha", "Shreya", "Rama", "Suja"};

        for (String h: strArray){

            System.out.println("Names of the people in my family are " + h);
        }


    }
}
