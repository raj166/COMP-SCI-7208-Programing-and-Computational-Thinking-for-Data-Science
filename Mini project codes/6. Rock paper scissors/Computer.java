import java.util.Random;

public class Computer extends Player {

	private int selection_value;

	//default Constructor
	Computer(){
		super.setPlayerName("Computer");
	}

	//parametric constructor
	Computer(String name){
		super.setPlayerName(name);
	}

	@Override
	//randomly select output for computer player using random method
	public void performMove(){
		Random rand = new Random();
		selection_value = rand.nextInt(3);
		switch(selection_value){
			case 0:
				super.setPlayersSelection("ROCK");
				break;
			case 1:
				super.setPlayersSelection("PAPER");
				break;
			case 2:
				super.setPlayersSelection("SCISSORS");
				break;
		}//Switch
	}//performMove


}//end of computer class