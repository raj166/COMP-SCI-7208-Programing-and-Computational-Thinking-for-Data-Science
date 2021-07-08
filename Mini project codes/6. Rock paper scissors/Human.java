import java.util.Scanner;

public class Human extends Player {

	private int  selection_value;

	//default Constructor
	Human(){
		super.setPlayerName("Human");
	}

	//parametric constructor
	Human(String name){
		super.setPlayerName(name);
	}

	//return the selection of the humman player after selecting something else return null
	public String getPlayersSelection(){
		return super.getPlayersSelection();
	}



	@Override
	//performs move for the user by using switch and user input
	public void performMove(){
	System.out.format(" %s Select your move:", super.getPlayerName());
    try{
        System.out.format("%n 1) Roack. %n 2) Paper. %n 3) Scissors. %n ");
    	Scanner input = new Scanner(System.in);
    	selection_value = input.nextInt();
    	switch(selection_value){
    		case 1:
    			super.setPlayersSelection("ROCK");
    			//loop_entry = false;
    			break;
    		case 2:
    			super.setPlayersSelection("PAPER");
    			//loop_entry = false;
    			break;
    		case 3:
    			super.setPlayersSelection("SCISSORS");
    			//loop_entry = false;
    			break;
    		default:
    			super.setPlayersSelection("null");
    			System.out.println("You have entered a wrong choice!!");
    			break;

    			}//switch
        }//try
        catch(Exception e){
            System.out.println("You have entered a wrong choice!!");
        }

	}//performMove
}//end of computer class