package schoolhomework;

import java.util.Scanner;

public class Backwards {

    public static void main(String[] args) {

        System.out.println("Please enter a String: ");

        Scanner scan = new Scanner(System.in);
        String userInput;
        String finalOutput="";
        userInput = scan.next();
        System.out.println(userInput);

   /*     for (int i = 0; i<userInput.length(); i++){
           // System.out.println("Inside forloop" + i);
            //userInput.charAt(i);
            System.out.println(userInput.charAt(i));
        }*/

        for (int i = userInput.length(); i>0; i--){

           // System.out.println("Inside backward forloop" + i);

            System.out.println(userInput.charAt(i-1));

            finalOutput+= userInput.charAt(i-1); // Converting character to String
        }

        System.out.println("Final Output is : "+ finalOutput);






    }
}
