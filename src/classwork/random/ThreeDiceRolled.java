package classwork.random;

import java.util.Random;

public class ThreeDiceRolled {   public static void main(String[] args) {


    Random random = new Random();
    System.out.println(random.nextInt());

    for(int i = 0; i<=17; i++){
        int e = random.nextInt(18);

        while(e<=3){
            e = random.nextInt(18);

        }

        System.out.println("Dice rolled a " + e);
    }


}
}
