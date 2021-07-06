public abstract class VehicleAbstract{
	//Attributes
	public String color;
	public int year, numberGears;


	//Mutators
	public void setColor(String c){
		this.color = c;
	}


	public void setYear(int y){
		this.year = y;
	}

	public void setNumberGears(int g){
		this.numberGears = g;
	}


	//Accessors
	public String getColor(){
		return this.color ;
	}


	public int getYear(){
		return this.year ;
	}

	public int getNumberGears(){
		return this.numberGears ;
	}

}