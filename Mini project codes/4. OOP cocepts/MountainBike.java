public class MountainBike extends Bicycle{
	
	//attribute
	String suspension,forks;
	
	//Default Constructor
	MountainBike(){
		this.suspension="Unkown";
		this.forks="Unkown";
	}
	
	//Parametric Constructor
	MountainBike(int g , boolean s , String in , String out , String res ,String c, int y, int nG, String sus , String fork){
		this.suspension=sus;
		this.forks=fork;
		super.Gear = g;
		super.is_serviced = s;
		super.inDate = in;
		super.outDate = out;
		super.serviceResponsible = res;
		super.color = c;
		super.year =y;
		super.numberGears = nG;
	}

	//Mutators
	public void setSuspension(){
		this.suspension = "The suspension has been changed to Mountain Bike style.";
		System.out.println(suspension);
	}
	
	public void setForks(){
		this.forks = "The forks has been changed to new for the Mountain Bike comfort.";
		System.out.println(forks);
	}

	//Accessors
	public String getSuspension(){
		return this.suspension;
	}

	public String getForks(){
		return this.forks;
	}

	public static void main(String[] args) {

		//declaring all the required variables 
		double gear;
		double break_value;
		String fork;
		String Sus;
		
		//parametric constructor
		System.out.format("%n%n%n----------------------Mountain Bike 01----------------------%n");
		MountainBike MB = new MountainBike(15 , false , "2/4/2021" , "12/4/2021" , "Mechanic05" ,"Pinkish Red", 2021, 27 , "Good to go", "medium needs to be replaced");
		System.out.println("The color of the bike is " + MB.getColor() + ".");
		System.out.println("The bike has " + MB.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + MB.getYear() + ".");
		System.out.println("Is the bike serviced ? " + MB.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + MB.inDate + ".");
		System.out.println("The bike has to be delivered by " + MB.outDate + ".");
		System.out.println("The person responsible for the service is " + MB.serviceResponsible + ".");
		
		//bicycle class methods 
		System.out.println("Total no. of gear in this Bicycle: " +  MB.getNumberGears() + ".");
		gear = MB.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 3 times
		for (int i =0; i<3 ;i++ ) {
			gear = MB.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		break_value = MB.checkBreak();
		for (int i =0; i<3 ;i++ ) {
			break_value = MB.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		fork = MB.getForks();
		System.out.println("The forks :" + fork);
		Sus = MB.getSuspension();
		System.out.println("The suspension are in : "+ Sus);
		MB.setSuspension();
		MB.setForks();
		MB.checkoutService();
		System.out.println("Is the bike serviced ? " + MB.is_serviced + ".");



		System.out.format("%n%n%n----------------------Mountain Bike 02----------------------%n");
		//Default Constructor
		MountainBike MB1 = new MountainBike();
		//using mutators
		MB1.setColor("Green");
		MB1.setYear(2012);
		MB1.setNumberGears(36);
		MB1.Gear= 21;
		MB1.is_serviced= false;
		MB1.inDate="13/4/2021" ;
		MB1.outDate= "18/4/2021";
		MB1.serviceResponsible="Mechanic06" ;

		System.out.println("The color of the Mountain bike is " + MB1.getColor() + ".");
		
		System.out.println("The bike has " + MB1.getNumberGears() + " Gears.");
		
		System.out.println("The bike was bought in " + MB1.getYear() + ".");
		
		System.out.println("The bike came in on " + MB1.inDate + ".");
		
		System.out.println("The bike has to be delivered by " + MB1.outDate + ".");
		
		System.out.println("The person responsible for the service is " + MB1.serviceResponsible + ".");

		gear = MB1.changeGear();
		
		System.out.println("The gear is currently set to " + gear + ".");
		
		MB1.changeGear();
		MB1.changeGear();
		gear = MB1.changeGear();
		
		System.out.println("The gear is currently set to " + gear + ".");
		
		break_value = MB1.checkBreak();
		
		System.out.println("The gear is currently set to " + break_value + ".");
		
		fork = MB1.getForks();
		
		System.out.println("The forks :" + fork);

		Sus = MB1.getSuspension();

		System.out.println("The suspension are in : "+ Sus);

		MB1.setSuspension();

		MB1.setForks();

		MB1.checkoutService();
		
		System.out.println("Is the bike serviced ? " + MB.is_serviced + ".");

		System.out.format("%n%n%n%n");
		
	}//end of main

}//end of MountainBike class