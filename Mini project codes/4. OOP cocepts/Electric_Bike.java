public class Electric_Bike extends Bicycle{
	//attribute
	boolean battery;

	//default Constructor
	Electric_Bike(){
		this.battery = false;
	}

	//Parametric Constructor
	Electric_Bike(boolean b ,int g , boolean s , String in , String out , String res ,String c, int y, int nG){
		
		this.battery = b;
		super.Gear = g;
		super.is_serviced = s;
		super.inDate = in;
		super.outDate = out;
		super.serviceResponsible = res;
		super.color = c;
		super.year =y;
		super.numberGears = nG;
	}

	public void chargeBike(){
		if(!battery){
			System.out.println("lets charge the bike ...." );
			System.out.println("The Electric bike is beeing charged");
			this.battery = true;
			System.out.format("***************** %nThe battery is fully charged!%n");
		}
		else{
			System.out.format("%nThe battery is fully charged!%n");
		}
	}


	public static void main(String[] args) {
		
		
		
		//parametric constructor is being used 
		System.out.println("----------------------Electric Bike 01----------------------");
		Electric_Bike EB = new Electric_Bike(false ,15 , false , "2/4/2021" , "23/4/2021" , "Mechanic03" ,"Redish", 2021, 27);
		System.out.println("The color of the bike is " + EB.getColor() + ".");
		System.out.println("The bike has " + EB.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + EB.getYear() + ".");
		System.out.println("Is the bike fully charged? " + EB.battery + ".");
		EB.chargeBike();
		System.out.println("Is the bike serviced ? " + EB.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + EB.inDate + ".");
		System.out.println("The bike has to be delivered by " + EB.outDate + ".");
		System.out.println("The person responsible for the service is " + EB.serviceResponsible + ".");
	
		//bicycle class methods
		System.out.println("Total no. of gear in this Bicycle: " +  EB.getNumberGears() + ".");
		double gear = EB.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 4 times
		for (int i =0; i<3 ;i++ ) {
			gear = EB.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		double break_value = EB.checkBreak();
		for (int i =0; i<3 ;i++ ) {
			break_value = EB.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		EB.checkoutService();
		System.out.println("Is the bike serviced ? " + EB.is_serviced + ".");
		

		
		
		//default constructor 
		System.out.format("%n%n%n----------------------Electric Bike 02----------------------%n");
		Electric_Bike EB1 = new Electric_Bike();
		//using mutators
		EB1.setColor("Pink");
		EB1.setYear(2016);
		EB1.setNumberGears(32);
		EB1.battery = true;
		EB1.Gear= 12;
		EB1.is_serviced= false;
		EB1.inDate="3/4/2021" ;
		EB1.outDate= "8/4/2021";
		EB1.serviceResponsible="Mechanic04" ;

		//using Accessors
		System.out.println("The color of the bike is " + EB1.getColor() + ".");
		System.out.println("The bike has " + EB1.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + EB1.getYear() + ".");
		System.out.println("Is the bike fully charged? " + EB1.battery + ".");
		EB1.chargeBike();
		System.out.println("Is the bike serviced ? " + EB1.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + EB1.inDate + ".");
		System.out.println("The bike has to be delivered by " + EB1.outDate + ".");
		System.out.println("The person responsible for the service is " + EB1.serviceResponsible + ".");
	
		//bicycle class methods
		System.out.println("Total no. of gear in this Bicycle: " +  EB1.getNumberGears() + ".");
		gear = EB1.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 4 times
		for (int i =0; i<3 ;i++ ) {
			gear = EB1.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		break_value = EB1.checkBreak();
		for (int i =0; i<3 ;i++ ) {
			break_value = EB1.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		EB1.checkoutService();
		System.out.println("Is the bike serviced ? " + EB1.is_serviced + ".");
		System.out.format("%n%n%n%n");
	}//end of main
}//end of Electric_Bike class