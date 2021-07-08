public class Referee{
    String Player_type;

    Referee(String p){
        this.Player_type = p;
    }

    //this method will decide the winner and return int containg o for player 1 1 for player 2 and 2 for tie
	public int decideWinner(String p1 , String com){

	    // 0 - player1
        // 1 - Computer /player 2
        // 2 - tie
        //8 - error

        if(com.equals("null") || p1.equals("null")){
            System.out.println("One of the user has not selected correct input");
            return 8;
        }
	    else if(p1.equals("ROCK") && com.equals("SCISSORS"))
            return 0;
        else if(p1.equals("PAPER") && com.equals("ROCK"))
            return 0;
        else if(p1.equals("SCISSORS") && com.equals("PAPER"))
            return 0;
        else if(com.equals("ROCK") && p1.equals("SCISSORS"))
            return 1;
        else if(com.equals("PAPER") && p1.equals("ROCK"))
            return 1;
        else if(com.equals("SCISSORS") && p1.equals("PAPER"))
            return 1;
        else
            return 2;



	}//decideWinner


    //this will declare the winner using the int return from declare winner method
	public void displayWinner(int winner){
	    switch(winner) {
            case 0:
                System.out.format("Player 1 has won!%n");
                break;
            case 1:
                //player type will print wether its computer or humman player 2
                System.out.format("%s has won!%n", this.Player_type);
                break;
            case 2:
                System.out.format("It is a tie!%n");
                break;
            case 8:
                System.out.println("One of the input is not selected");

        }
	}//displayWinner


}//Referee class