package recap;

public class Recap {

    public void method1(){
        System.out.println("inside method1");
    }
    public int method2(){
        return 2;
    }
    public void method3(int number){
        System.out.println("The number is " + number);
    }
    public void method4(String esha){
        System.out.println("The name is " + esha);
    }
    public int method5(int number){
        return number*number;
    }
    public int method6(int number){
        return number+number;
    }
    public String method7(String bear){
        return bear.concat("bear");
    }
    public static void main(String[] args) {
        Recap esha = new Recap();

        esha.method1();
        System.out.println(esha.method2());
        esha.method2();
        int val = esha.method2();
        System.out.println(val);
        int val2 = 2;
        esha.method3(val2);
        String bear = "esha";
        esha.method4(bear);
        int val3 = esha.method5(9);
        System.out.println(val3);
        int val4 = esha.method5(5);
        System.out.println(val4);
        int val5 = esha.method6(20);
        System.out.println(val5);
        int val6 = esha.method6(100);
        System.out.println(val6);
        String val7 = esha.method7("esha");
        System.out.println(val7);
        String val8 = esha.method7("shreya");
        System.out.println(val8);
        String val9 = esha.method7("dog");
        System.out.println(val9);


        for (int i=1; i<10; i++){
            System.out.println("Forward loop: " + i);
        }
        for (int i =10; i>0; i--){
            System.out.println("Backward loop: " + i);
        }
        int j = 5;
        while(j>0){
            System.out.println(j);
            j--;
        }
        int g = 0;
        while(g<10){
            System.out.println(g);
            g++;
        }




    }
}
