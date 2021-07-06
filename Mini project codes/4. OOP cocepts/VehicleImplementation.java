public class VehicleImplementation{
	public static void main(String[] args) {
		
		System.out.format("%n%n----------------------Electric Bike 01----------------------%n%n");
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
		String fork = MB.getForks();
		System.out.println("The forks :" + fork);
		String Sus = MB.getSuspension();
		System.out.println("The suspension are in : "+ Sus);
		MB.setSuspension();
		MB.setForks();
		MB.checkoutService();
		System.out.println("Is the bike serviced ? " + MB.is_serviced + ".");



		//parametric constructor
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


		//parametric constructor is being used 
		System.out.format("%n%n%n----------------------Hibrid Bike 01----------------------%n");
		Hibrid HB = new Hibrid("Suspension is not good for Hibrid bike!!",16 , true , "21/2/21" , "23/3/21" , "Mechanic10" ,"Majenta", 2012, 36 );
		System.out.println("The color of the bike is " + HB.getColor() + ".");
		System.out.println("The bike has " + HB.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + HB.getYear() + ".");
		System.out.println("Is the bike serviced ? " + HB.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + HB.inDate + ".");
		System.out.println("The bike has to be delivered by " + HB.outDate + ".");
		System.out.println("The person responsible for the service is " + HB.serviceResponsible + ".");
		//bicycle class methods 
		System.out.println("Total no. of gear in this Bicycle: " +  HB.getNumberGears() + ".");
		gear = HB.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 3 times
		for (int i =0; i<3 ;i++ ) {
			gear = HB.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		break_value = HB.checkBreak();
		for (int i =0; i<3 ;i++ ) {
			break_value = HB.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		Sus = HB.getSuspension();
		System.out.println("The suspension are in : "+ Sus);
		HB.setSuspension();
		HB.checkoutService();
		System.out.println("Is the bike serviced ? " + HB.is_serviced + ".");

	}//main
}//VehicleImplementation