package schoolhomework;

import java.util.Scanner;

public class Squares {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        int number=0;


        boolean userInput = true;

        while (userInput){
            System.out.println("Enter a whole number: ");
            number = scan.nextInt();
            System.out.println("The number you chose is " + number);

            if (number<0){
                userInput = false;
                System.out.println("You entered a negative number so exiting the program");
            }

            //Math.sqrt(number);
            System.out.println(Math.sqrt(number));

        }
    }




}
