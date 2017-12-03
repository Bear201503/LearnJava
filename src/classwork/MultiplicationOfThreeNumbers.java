package classwork;

import java.util.Scanner;

public class MultiplicationOfThreeNumbers {

    public int multiplicationOfThreeNumbers (int num1, int num2, int num3) {
        return num1*num2*num3;
    }


    public static void main(String[] args) {


        System.out.println("Enter 3 numbers");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        MultiplicationOfThreeNumbers multiply = new MultiplicationOfThreeNumbers();
        int val = multiply.multiplicationOfThreeNumbers(num1, num2, num3);
        System.out.println("The three numbers multiplied by each other is " + val);

    }




}
