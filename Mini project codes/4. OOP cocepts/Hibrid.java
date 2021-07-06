public class Hibrid extends Bicycle{

	String suspension;

	//default constructor
	Hibrid(){
		this.suspension = "Unkown";
	}

	//parametric constructor
	Hibrid(String b ,int g , boolean s , String in , String out , String res ,String c, int y, int nG){
		
		this.suspension = b;
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
		this.suspension = "The suspension has been changed for the hybrid bike.";
		System.out.println(suspension);
	}

	//Accessors
	public String getSuspension(){
		return this.suspension;
	}

	public static void main(String[] args) {
		
		//declaring all the required variables 
		double gear;
		double break_value;
		String Sus;

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
		


		System.out.format("%n%n%n----------------------Hibrid Bike 02----------------------%n");
		Hibrid HB1 = new Hibrid();
		//using mutators
		HB1.setColor("Green");
		HB1.setYear(2012);
		HB1.setNumberGears(36);
		HB1.Gear= 22;
		HB1.is_serviced= false;
		HB1.inDate="13/4/2021" ;
		HB1.outDate= "18/4/2021";
		HB1.serviceResponsible="Mechanic16" ;
		System.out.println("The color of the Mountain bike is " + HB1.getColor() + ".");
		System.out.println("The bike has " + HB1.getNumberGears() + " Gears.");		
		System.out.println("The bike was bought in " + HB1.getYear() + ".");
		System.out.println("The bike came in on " + HB1.inDate + ".");
		System.out.println("The bike has to be delivered by " + HB1.outDate + ".");
		System.out.println("The person responsible for the service is " + HB1.serviceResponsible + ".");
		gear = HB1.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		HB1.changeGear();
		HB1.changeGear();
		gear = HB1.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		break_value = HB1.checkBreak();
		System.out.println("The gear is currently set to " + break_value + ".");
		Sus = HB1.getSuspension();
		System.out.println("The suspension are in : "+ Sus);
		HB1.setSuspension();
		HB1.checkoutService();
		System.out.println("Is the bike serviced ? " + HB1.is_serviced + ".");
	}//main
}//Hibrid