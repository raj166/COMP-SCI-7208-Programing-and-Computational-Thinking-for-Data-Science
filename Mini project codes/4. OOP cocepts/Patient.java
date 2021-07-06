public class Patient extends Person{
	
	//Attributes	
	String diagnostic ,inTime ,prevTime;

	//Default Constructor
	Patient(){
	 	this.diagnostic ="Unknown";
	 	this.inTime ="Unknown";
	 	this.prevTime ="Unknown";
	 }
	
	//Parametric Constructor
	Patient(String name , String last_name , String citizen , String gender , int age, String user_diagnostic , String user_inTime , String user_prevTime ){
		super(name , last_name , citizen , gender , age);
		this.diagnostic =user_diagnostic;
	 	this.inTime = user_inTime;
	 	this.prevTime = user_prevTime;
	}

	//Mutators
	public void setDiagnostic(String d){
	 	this.diagnostic = d;
	}

	public void setInTime(String d){
	 	this.inTime = d;
	}

	public void setPrevTime(String d){
	 	this.prevTime = d;
	}


	//Accessors
	public String getDiagnostic(){
	 	return this.diagnostic;
	}

	public String getInTime(){
	 	return this.inTime;
	}

	public String getPrevTime(){
	 	return this.prevTime;
	}

	public static void main(String[] args) {

		System.out.format("%n%n%n------Patient Parametric Constructor -------%n%n");
		Patient obj4 = new Patient("Isshi","Gerula","India" , "Female"  ,19, "Regular Checkup" , "7" , "Small bites on hands" );
		System.out.format("Full name of Patient: %s. %n", obj4.getName());
		System.out.format("%s is %s. %n" , obj4.getName() , obj4.getGender());
		System.out.format("%s has Citizenship of  %s. %n" ,obj4.getName() , obj4.getCitizenshipStatus() );
		System.out.format("Age of %s is %d. %n" ,obj4.getName()  , obj4.getAge());
		System.out.format("Patient has came for : %s. %n" , obj4.diagnostic);
		System.out.format("Patient has visited %s times. %n" , obj4.inTime);
		System.out.format("Patient had came preivious time for : %s. %n" , obj4.prevTime);


		System.out.format("%n%n%n------Patient Default Constructor -------%n%n");
		Patient obj5 = new Patient();
		obj5.giveName("Ameya");
		obj5.lastName("rama");
		obj5.gender("Male");
		obj5.citizenship("Australian");
		obj5.age(46);
		obj5.setDiagnostic("Polio");
		obj5.setInTime("12");
		obj5.setPrevTime("Injection for some polio related thing");
		System.out.format("Full name of Patient: %s. %n", obj5.getName());
		System.out.format("%s is %s. %n" , obj5.getName() , obj5.getGender());
		System.out.format("%s has Citizenship of  %s. %n" ,obj5.getName() , obj5.getCitizenshipStatus() );
		System.out.format("Age of %s is %d. %n" ,obj5.getName()  , obj5.getAge());
		System.out.format("Patient has came for : %s. %n" , obj5.diagnostic);
		System.out.format("Patient has visited %s times. %n" , obj5.inTime);
		System.out.format("Patient had came preivious time for : %s. %n" , obj5.prevTime);

	}//end of main
	 
}//end of Patient class