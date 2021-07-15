//import Linkedlist from java.util..
import java.util.LinkedList;

public class Club {

    //creating a linkedlist of Players in the Club
    LinkedList<Player> ll = new LinkedList<>();


    //add players to the linkedlist
    public void addMember(Player temp){

        //add the player to the starting of the list using inbuilt function add
        ll.add(temp);
    }//addMember


    //removes the player is present and returns true else false
    public boolean removeMemberById(int id){
        //get the index of the player to be removeMemberById
        int i = 0;
        int index =-1;

        //traverse the list and find if the player with id required present or not
        for(Player temp : ll){

            //if id matches
            if(temp.getId() == id){
                //set the value of index to the player index
                index = i;
                break;
            }
            //increse the count ot i;
            i++;
        }
        //if player not present
        if(index == -1){
            return false;
        }
        else{
            //if the player is present we remove it using the index from the above for loop and return true
            ll.remove(index);
        }        
        return true;
    }//removeMemberById


    //get the hihest rankin of the player 
    public Player getHighestRankedPlayer(){

        //player with highestRank if present change value else return null
        Player highestRank = null;
        //iniitial value for comparer Score = 0
        int Score = 0;

        //traverse the linkedlist
        for(Player temp : ll){
            //if the score of player is graterthan the present max then update the details
            if(temp.getRanking()>=Score){
                highestRank = temp;
                Score = temp.getRanking();
            }
        }
        return highestRank;
    }//getHighestRankedPlayer


    //print the list of all the members in club
    public void printMembers(){
        //traverse and access each node having players
        for(Player temp : ll){

            //toString method return string with players details
            System.out.println(temp.toString());
        }
    }//printMembers


}//club class
