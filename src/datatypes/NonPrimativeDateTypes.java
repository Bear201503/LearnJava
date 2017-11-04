package datatypes;

public class NonPrimativeDateTypes {

    public static void main(String[] args) {

        String s1 = "Esha";

        System.out.println("Value of s1 is " + s1);

        System.out.println(s1.trim());

        System.out.println(s1.substring(0,2));
        System.out.println(s1.substring(2,4));
        System.out.println(s1.replace('E', 'g'));

        String s2 = "s1";
        System.out.println("The value of s2 is:" + s1);

        String s3 = new String("Esha");

        System.out.println("The value of s3 is " + s3);

        System.out.println("The length of s3 is " + s3.length());

        System.out.println(s3.charAt(2));

        String s4 = "Car";
        String s5 = "Bike";
        String s6 = "bike";

        System.out.println(s5.equalsIgnoreCase(s6));

        System.out.println(s5.contains("k"));

        System.out.println(s5.contains("a"));

        System.out.println(s5.toUpperCase());

        System.out.println(s5);

        String s7 = "car-bike-trailer";

        System.out.println(s7.split("-"));

        String[] strings = s7.split("-");

        for(String str : strings){

            System.out.println("Split value is " + str);
        }



    }
}
