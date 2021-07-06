public class Bicycle extends VehicleAbstract implements Vehicle{
	
	//Attributes
	public int Gear ; 	
	public boolean is_serviced; 
	public String inDate, outDate , serviceResponsible;

	//default Constructor
	Bicycle(){
		this.Gear = 0;
		this.is_serviced = false;
		this.inDate = "Unkown";
		this.outDate = "Unkown";
		this.serviceResponsible = "Unkown";
	}

	//Parametric Constructor
	Bicycle(int g , boolean s , String in , String out , String res ,String c, int y, int nG){
		this.Gear = g;
		this.is_serviced = s;
		this.inDate = in;
		this.outDate = out;
		this.serviceResponsible = res;
		super.color = c;
		super.year =y;
		super.numberGears = nG;
	}
	
	public void checkoutService(){
		this.is_serviced = true;
		System.out.println("Bicycle has been serviced plz checkout !!");
	}

	public double changeGear(){
		System.out.println("The Gear is being changed.");
		this.Gear = this.Gear+1;
		return this.Gear;

	}
	public double checkBreak(){
		System.out.println("The Break is being applied.");
		this.Gear = this.Gear -1;
		return this.Gear;
	}

	public static void main(String[] args) {
		
		//making object of bicycle
		//using default constructor
		Bicycle bi = new Bicycle();
		System.out.println("----------------------Bicycle-1----------------------");
		
		//parent class methods of bicycle class 
		bi.setColor("Red");
		bi.setNumberGears(27);
		bi.setYear(2012);


		//child class attributes
		bi.is_serviced = false;
		bi.inDate = "3/4/2021";
		bi.outDate = "5/4/2021";
		bi.serviceResponsible = "Mechanic01";


		System.out.println("The color of the bike is " + bi.getColor() + ".");
		System.out.println("The bike has " + bi.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + bi.getYear() + ".");
		System.out.println("Is the bike serviced ? " + bi.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + bi.inDate + ".");
		System.out.println("The bike has to be delivered by " + bi.outDate + ".");
		System.out.println("The person responsible for the service is " + bi.serviceResponsible + ".");


		////bicycle class methods 
		
		bi.Gear = 23;
		System.out.println("Total no. of gear in this Bicycle: " +  bi.getNumberGears() + ".");
		double gear = bi.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 4 times
		for (int i =0; i<4 ;i++ ) {
			gear = bi.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		
		double break_value = bi.checkBreak();

		for (int i =0; i<4 ;i++ ) {
			break_value = bi.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		bi.checkoutService();
		System.out.println("Is the bike serviced ? " + bi.is_serviced + ".");


		System.out.format("%n%n%n%n");



		System.out.println("----------------------Bicycle-2----------------------");
		//making the use of parametric constructor
		Bicycle byc = new Bicycle(3 , false , "2/4/2021" , "10/4/2021" , "Mechanic02" ,"Yellow", 2019, 32);
		System.out.println("The color of the bike is " + byc.getColor() + ".");
		System.out.println("The bike has " + byc.getNumberGears() + " Gears.");
		System.out.println("The bike was bought in " + byc.getYear() + ".");
		System.out.println("Is the bike serviced ? " + byc.is_serviced + ".");
		System.out.println("When did the bike came and whats the delivery date?");
		System.out.println("The bike came in on " + byc.inDate + ".");
		System.out.println("The bike has to be delivered by " + byc.outDate + ".");
		System.out.println("The person responsible for the service is " + byc.serviceResponsible + ".");


		////bicycle class methods 
		
		byc.Gear = 23;
		System.out.println("Total no. of gear in this Bicycle: " +  byc.getNumberGears() + ".");
		gear = byc.changeGear();
		System.out.println("The gear is currently set to " + gear + ".");
		//increases the gear 4 times
		for (int i =0; i<3 ;i++ ) {
			gear = byc.changeGear();
		}
		System.out.println("The gear is currently set to " + gear + ".");
		
		break_value = byc.checkBreak();

		for (int i =0; i<3 ;i++ ) {
			break_value = byc.checkBreak();
		}
		System.out.println("The gear is currently set to " + break_value + ".");
		byc.checkoutService();
		System.out.println("Is the bike serviced ? " + byc.is_serviced + ".");


		System.out.format("%n%n%n%n");



	}

}