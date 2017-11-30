

package classwork;


import java.util.Scanner;

public class SumOfThreeNumbers {

    public int sumOfThreeNumbers (int num1, int num2, int num3){
        return num1+num2+num3;
    }

    public static void main(String[] args) {

        System.out.println("Please enter 3 numbers");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();



        SumOfThreeNumbers sum = new SumOfThreeNumbers();
        int val = sum.sumOfThreeNumbers(num1, num2, num3);
        System.out.println("The sum of the numbers is " + val);


//        int val = sum.sumOfThreeNumbers(1, 2, 3);
//        System.out.println(val);
//        SumOfThreeNumbers sum2 = new SumOfThreeNumbers();
//        int val2 = sum2.sumOfThreeNumbers(4,5,6);
//        System.out.println(val2);
//        SumOfThreeNumbers sum3 = new SumOfThreeNumbers();
//        int val3 = sum3.sumOfThreeNumbers(7,8,9);
//        System.out.println(val3);


    }
}
