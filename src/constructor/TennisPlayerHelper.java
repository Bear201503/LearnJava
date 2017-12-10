package constructor;

public class TennisPlayerHelper {
    public static void main(String[] args) {

        TennisPlayer tennisPlayer = new TennisPlayer();

        tennisPlayer.setName("Senior");
        System.out.println(tennisPlayer.getName());

        tennisPlayer.setGamesWon(5);
        System.out.println(tennisPlayer.getGamesWon());

        tennisPlayer.setJerseyNumber(40);
        System.out.println(tennisPlayer.getJerseyNumber());

        tennisPlayer.setRank(4);
        System.out.println(tennisPlayer.getRank());

        tennisPlayer.setGender("female");
        System.out.println(tennisPlayer.getGender());

        tennisPlayer.setJerseyNumber(45);
        System.out.println(tennisPlayer.getJerseyNumber());

        tennisPlayer.setName("Bear");
        System.out.println(tennisPlayer.getName());

        tennisPlayer.setGamesWon(48);
        System.out.println(tennisPlayer.getGamesWon());

        tennisPlayer.setRank(1);
        System.out.println(tennisPlayer.getRank());

        tennisPlayer.setGender("female");
        System.out.println(tennisPlayer.getGender());


        TennisPlayer tennisPlayer1 = new TennisPlayer();

        tennisPlayer1.setName("Esha");
        System.out.println(tennisPlayer1.getName());

        tennisPlayer1.setGender("female");
        System.out.println(tennisPlayer1.getGender());

        tennisPlayer1.setGamesWon(57);
        System.out.println(tennisPlayer1.getGamesWon());

        tennisPlayer1.setJerseyNumber(-8);
        System.out.println(tennisPlayer1.getJerseyNumber());

        tennisPlayer1.setRank(-3);
        System.out.println(tennisPlayer1.getRank());
    }
}
