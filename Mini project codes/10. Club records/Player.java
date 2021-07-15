//player extends person class
public class Player extends Person {

    //static variable declared only only
    private static int numberOFPlayers = 1;
    //private member variable
    private int id,numWins, numPlayed;


    //parameteric constructor
    Player(String name , int age , int wins , int played) {
        //calls person class constructor
        super(name,age);
        //assing a unique id and then increase it by 1
        this.id = numberOFPlayers++;
        this.numWins = wins;
        this.numPlayed = played;
    }


    //methods
    //Increses the number of match palyed and win
    public void win(){
        this.numWins +=1;
        this.numPlayed +=1;
    }

    
    //increses the number of match palyed
    public void lose(){
        this.numPlayed +=1;
    }

    
    //calculates the rannk of the player and return the value
    public int getRanking(){
        //if thep player has not played any match return 0
        if(numPlayed==0){
            return 0;
        }
        //type casting to int as the calculation can be in float
        return  (int) numPlayed*(numWins/numPlayed);
    }//getRanking

    
    //retursn string "Person: __name__ is age: __age__ Id: __id__ Ranking: __ranking__"
    //adding all info to the string returnString one after another
    public String toString(){
        String returnString = "Person: ";
        returnString += this.getName();
        returnString += " is age: ";
        returnString += this.getAge();
        returnString += " Id: ";
        returnString += this.getId();
        returnString += " Ranking: ";
        returnString += this.getRanking();
        return returnString;
    }//toString

    
    //accessors
    public int getId(){
        return this.id;
    }

    
    public int getnumWins(){
        return this.numWins;
    }


    public int getnumPlayed(){
        return this.numPlayed;
    }

}//Player class
