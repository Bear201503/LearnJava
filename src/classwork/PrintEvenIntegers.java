

package classwork;

import schoolhomework.AddEvenIntegers;

import java.util.Scanner;

public class PrintEvenIntegers {

    public static void main(String[] args) {

        System.out.println("Enter an even integer greater than or equal to 2");

        int userInput = 0;

        boolean isValidValue = true;

        Scanner scan = new Scanner(System.in);

        PrintEvenIntegers esha2 = new PrintEvenIntegers();
        while(isValidValue) {
            userInput = scan.nextInt();
            isValidValue = esha2.checkUserInput(userInput, isValidValue);
        }
    }
    public boolean checkUserInput(int userInput, boolean isValidValue){
        System.out.println("Check userInput value " + userInput);

        if (userInput < 2) {
            System.out.println("Please enter a number greater than or equal to 2");
        }
        else{
            isValidValue = false;
            System.out.println("The entered value is " + userInput);
        }
return isValidValue;
    }
}
