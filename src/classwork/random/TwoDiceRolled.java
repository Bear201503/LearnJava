package classwork.random;

import java.util.Random;

public class TwoDiceRolled {
    public static void main(String[] args) {


        Random random = new Random();
        System.out.println(random.nextInt());

        for(int i = 0; i<=11; i++){
            int e = random.nextInt(12);

            while(e<=2){
                e = random.nextInt(12);

            }

            System.out.println("Dice rolled a " + e);
        }


    }
}
