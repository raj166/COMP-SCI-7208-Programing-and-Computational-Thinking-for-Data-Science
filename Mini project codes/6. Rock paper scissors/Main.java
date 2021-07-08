import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);

		//play_type variable is used to select human vs human or comp vs human
        int play_type;
		boolean loop_entry = true;

		//creating human object and default name player 1
		Human humPlayer = new Human("Player 1");

		//Creating computer obj
		Computer compPlayer = new Computer();

		//creating human object and default name player 1
		Human humPlayer2 = new Human("Player 2");


	    try{

    		System.out.format("How do you want to play? %n1)Human vs Computer %n2)Human vs Human %n");
    		play_type = input.nextInt();

            //plyer type 1 is Human vs Computer
            if(play_type ==1){

                humPlayer.performMove();
    			System.out.format("Player 1 has selected %s. %n" ,humPlayer.getPlayersSelection());
    			if(humPlayer.getPlayersSelection() == "null"){
    				System.out.println("The player 1 plz select correct value");
    			}
    			else{
    				compPlayer.performMove();
					System.out.format("Computer has selected %s. %n",compPlayer.getPlayersSelection());
	    			Referee ref = new Referee("Computer");
	    			int result = ref.decideWinner(humPlayer.getPlayersSelection() , compPlayer.getPlayersSelection() );
	    			ref.displayWinner(result);

    			}


    		}

            //plyer type 2 is Human vs Human

    		else if(play_type ==2){
    			humPlayer.performMove();
    			if(humPlayer.getPlayersSelection() == "null"){
    				System.out.println("The player 1 plz select correct value");

    			}
    			else{
	    		  	humPlayer2.performMove();
	    		  	if(humPlayer2.getPlayersSelection() == "null"){
	    		  		System.out.println("The player 2 plz select correct value");

	    		  	}
	    		  	else{
	    		  		System.out.format("Player 1 has selected %s. %n",humPlayer.getPlayersSelection());
	    		  		System.out.format("Player 2 has selected %s. %n",humPlayer2.getPlayersSelection());
	    		  		Referee ref = new Referee("Player 2");
	    		  		int result = ref.decideWinner(humPlayer.getPlayersSelection(),humPlayer2.getPlayersSelection() );
	    		  		ref.displayWinner(result);

	    		  	}
	    		  }
	    		}

    		else{
    			System.out.println("You have entered a wrong choice");
    			throw new Exception("Sorry you have selected other than 1 & 2");
    		}

        }
        catch(Exception e){


            System.out.println(e);

        }

	}//main

}//end of Main class