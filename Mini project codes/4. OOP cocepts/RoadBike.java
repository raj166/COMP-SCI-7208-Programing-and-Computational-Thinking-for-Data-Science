public class RoadBike extends Bicycle{
	//attributes
	String tyres;

	//default Constructor
	RoadBike(){
		this.tyres = "Unkown";
	}

	//Parametric Constructor
	RoadBike(String t ,int g , boolean s , String in , String out , String res ,String c, int y, int nG){
		
		this.tyres = t;
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
	public void setTyres(){
		this.tyres = "The tyres has been changed to Road tyres.";
		System.out.println(tyres);
	}

	//Accessors
	public String getTyres(){
		return this.tyres;
	}

	public static void main(String[] args) {

		//declaring all the required variables 
		double gear;
		double break_value;
		
		//parametric constructor is being used 
		System.out.format("%n%n%n----------------------Road Bike 01----------------------%n");
		RoadBike RB = new RoadBike("Tyres Need to be replaced to road bike!!",12 , false , "21/3/21" , "28/3/21" , "Mechanic 07" ,"Gold", 2017, 32 );
		System.out.println("The color of the bike is " + RB.getColor() + ".");
		System.out.println("The bike has " + RB.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + RB.getYear() + ".");
		System.out.println("Is the bike serviced ? " + RB.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + RB.inDate + ".");
		System.out.println("The bike has to be delivered by " + RB.outDate + ".");
		System.out.println("The person responsible for the service is " + RB.serviceResponsible + ".");
		System.out.println("Total no. of gear in this Bicycle: " +  RB.getNumberGears() + ".");
		gear = RB.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 4 times
		for (int i =0; i<4 ;i++ ) {
			gear = RB.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		break_value = RB.checkBreak();
		for (int i =0; i<3 ;i++ ) {
			break_value = RB.checkBreak();
		}
		//Roadbike methods and value 
		String tyres_status =RB.getTyres();
		System.out.println(tyres_status);
		RB.setTyres();
		System.out.println("The gear is currently set to " + break_value + ".");
		RB.checkoutService();
		System.out.println("Is the bike serviced ? " + RB.is_serviced + ".");



		System.out.format("%n%n%n----------------------Road Bike 02----------------------%n");
		RoadBike RB2 = new RoadBike();
		//using mutators
		RB2.tyres = "Tyres Need to be changed to road bike tyres!!";
		RB2.setColor("Pink");
		RB2.setYear(2016);
		RB2.setNumberGears(32);
		RB2.Gear= 12;
		RB2.is_serviced= false;
		RB2.inDate="3/4/2021" ;
		RB2.outDate= "8/4/2021";
		RB2.serviceResponsible="Mechanic04" ;

		//using Accessors
		System.out.println("The color of the bike is " + RB2.getColor() + ".");
		System.out.println("The bike has " + RB2.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + RB2.getYear() + ".");
		System.out.println("Is the bike serviced ? " + RB2.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + RB2.inDate + ".");
		System.out.println("The bike has to be delivered by " + RB2.outDate + ".");
		System.out.println("The person responsible for the service is " + RB2.serviceResponsible + ".");
	
		//bicycle class methods
		System.out.println("Total no. of gear in this Bicycle: " +  RB2.getNumberGears() + ".");
		gear = RB2.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 4 times
		for (int i =0; i<3 ;i++ ) {
			gear = RB2.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		break_value = RB2.checkBreak();
		for (int i =0; i<3 ;i++ ) {
			break_value = RB2.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		RB2.checkoutService();
		tyres_status =RB2.getTyres();
		System.out.println(tyres_status);
		RB2.setTyres();
		System.out.println("Is the bike serviced ? " + RB2.is_serviced + ".");
	}//end of main

}//enf of RoadBike