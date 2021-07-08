public abstract class Player{

	private String Player_name;
	private String Player_Selection;

	//default Constructor
	Player(){}

	//Parametric Constructor
	Player(String player_name){
		this.Player_name = player_name;
	}

	//set player name using this method
	public void setPlayerName(String player_name){
		this.Player_name = player_name ;
	}

	//get players name after using setplayer name or else it will return null
	public String getPlayerName(){
		return this.Player_name;
	}

	//this will do the selection for the player/ computer
	public void setPlayersSelection(String choice){
		this.Player_Selection = choice;
	}

	//this will retunr the selection of the player to compare the output of the human/ computer and gice us the result using other decide the winner and declare the winner
	public String getPlayersSelection(){
		return this.Player_Selection;
	}

	//this is abstract method so we need to override the perfrom move method in the derived class
	public abstract void performMove();


}