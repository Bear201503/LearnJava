package constructor;

public class TennisPlayer {

    private String name;
    private String gender;
    private int gamesWon;
    private int rank;
    private int jerseyNumber;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setGamesWon(int gamesWon){
        this.gamesWon = gamesWon;
    }

    public int getGamesWon(){
        return this.gamesWon;
    }

    public TennisPlayer(){
        System.out.println("TennisPlayer");
    }
    public TennisPlayer(String name1, String gender1){
        this.name = name1;
        this.gender = gender1;
    }
    public void setJerseyNumber(int jerseyNumber){
        if(jerseyNumber<0){
            this.jerseyNumber=0;
        }
        else
            this.jerseyNumber = jerseyNumber;
    }
    public int getJerseyNumber(){
        return this.jerseyNumber;
    }
    public void setRank(int rank){
        if(rank<0){
            this.rank = 999;
        }
        else
            this.rank = rank;
    }
    public int getRank(){
        return this.rank;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
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



}
