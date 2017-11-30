package classwork;

import java.util.Scanner;

public class SumOfFourNumbers {

    public int sumOfFourNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }

    public static void main(String[] args) {

        System.out.println("Enter 4 numbers");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        SumOfFourNumbers sum = new SumOfFourNumbers();
        int val=sum.sumOfFourNumbers(num1, num2, num3, num4);
        System.out.println("The sum of the four numbers is " + val);

        //SumOfFourNumbers sum = new SumOfFourNumbers();

        //int val = sum.sumOfFourNumbers(1,2,3,4);
        //System.out.println(val);
       // SumOfFourNumbers sum2 = new SumOfFourNumbers();
        //int val2 = sum2.sumOfFourNumbers(5,6,7,8);
        //System.out.println(val2);
    }
}
