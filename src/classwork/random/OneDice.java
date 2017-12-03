package classwork.random;

import java.util.Random;

public class OneDice {

    public static void main(String[] args) {

        Random random = new Random();
        System.out.println(random.nextInt());

        for (int i = 0; i<=5; i++){
            int e = random.nextInt(6);

         while (e==0){
             e = random.nextInt(6);
         }

            System.out.println("You rolled a " + e);
        }
    }
}
