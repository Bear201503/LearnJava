package classwork;

public class TennisPlayer {

    private String name;
    private String gender;
    private int gamesWon;
    private int rank;
    private int jerseyNumber;

    public TennisPlayer(){
        System.out.println("TennisPlayer");
    }
    public TennisPlayer(String name1, String gender1){
        this.name = name1;
        this.gender = gender1;
    }

    public TennisPlayer(String name1, String gender1, int gamesWon1, int rank1, int jerseyNumber){
    this.name = name1;
    this.gender = gender1;
    this.gamesWon = gamesWon1;
    this.rank = rank1;
    this.jerseyNumber = jerseyNumber;
    }
    public static void main(String[] args) {

        TennisPlayer tennisPlayer = new TennisPlayer("Esha", "female", 1000, 1, 15);
        System.out.println(tennisPlayer.name+", " + tennisPlayer.gender+", " + tennisPlayer.gamesWon+", " + tennisPlayer.rank+", " + tennisPlayer.jerseyNumber);

        TennisPlayer tennisPlayer2 = new TennisPlayer("Shreya", "female", 1000, 2, 12);
        System.out.println(tennisPlayer2.name+", " + tennisPlayer2.gender+", " + tennisPlayer2.gamesWon+", " + tennisPlayer2.rank+", " + tennisPlayer2.jerseyNumber);

        TennisPlayer tennisPlayer3 = new TennisPlayer("Rama", "male");
        System.out.println(tennisPlayer3.name+", " + tennisPlayer3.gender+", " + tennisPlayer3.gamesWon+", " + tennisPlayer3.rank+", " + tennisPlayer3.jerseyNumber);

        tennisPlayer.setJerseyNumber(20);
        System.out.println(tennisPlayer.name+", " + tennisPlayer.gender+", " + tennisPlayer.gamesWon+", " + tennisPlayer.rank+", " + tennisPlayer.jerseyNumber);

        tennisPlayer3.setJerseyNumber(72);
        System.out.println(tennisPlayer3.name+", " + tennisPlayer3.gender+", " + tennisPlayer3.gamesWon+", " + tennisPlayer3.rank+", " + tennisPlayer3.jerseyNumber);

        tennisPlayer2.setJerseyNumber(9);
        System.out.println(tennisPlayer2.name+", " + tennisPlayer2.gender+", " + tennisPlayer2.gamesWon+", " + tennisPlayer2.rank+", " + tennisPlayer2.jerseyNumber);

        tennisPlayer.setGamesWon(2000);
        System.out.println(tennisPlayer.name+", " + tennisPlayer.gender+", " + tennisPlayer.gamesWon+", " + tennisPlayer.rank+", " + tennisPlayer.jerseyNumber);

        tennisPlayer2.setGamesWon(2500);
        System.out.println(tennisPlayer2.name+", " + tennisPlayer2.gender+", " + tennisPlayer2.gamesWon+", " + tennisPlayer2.rank+", " + tennisPlayer2.jerseyNumber);

        tennisPlayer3.setGamesWon(3000);
        System.out.println(tennisPlayer3.name+", " + tennisPlayer3.gender+", " + tennisPlayer3.gamesWon+", " + tennisPlayer3.rank+", " + tennisPlayer3.jerseyNumber);





    }

    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;


    }
    public void setGamesWon(int gamesWon){
        this.gamesWon = gamesWon;
    }
}
