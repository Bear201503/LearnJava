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
            else{
                double sqrt = Math.sqrt(number);
                System.out.println(sqrt%1);
                //System.out.println(number/sqrt);
                //System.out.println(sqrt*sqrt);
                if (sqrt%1==0.0){
                    System.out.println("The user entered number is a perfect square");
                }
                else{
                    System.out.println("Th user entered number is not a perfect square");
                }
            }
            //Math.sqrt(number);
            //System.out.println(Math.sqrt(number));
        }
    }
}
