public class Doctor extends Person{
	String speciality;

	//default constructors
	Doctor(){
	 	this.speciality ="Unknown";
	 	
	 }
	
	//Parametric Constructor
	Doctor(String name , String last_name , String citizen , String gender , int age, String s ){
		super(name , last_name , citizen , gender , age);
		this.speciality = s;
	}

	//mutators
	public void setSpeciality(String d){
	 	this.speciality = d;
	}


	//accessors
	public String setSpeciality(){
	 	return this.speciality;
	}

	public static void main(String[] args) {
				

		//default Constructor
		System.out.format("%n-------Doctor's default Constructor------%n%n");
		Doctor obj3 = new Doctor();
		obj3.giveName("Dr. Ameya");
		obj3.lastName("rama");
		obj3.gender("Male");
		obj3.citizenship("Australian");
		obj3.age(46);
		String Full_name = obj3.getName();
		System.out.print("Full name : ");
		System.out.println(Full_name);
		System.out.println(Full_name+ " is " + obj3.getGender());
		System.out.println(Full_name + " has Citizenship of "+ obj3.getCitizenshipStatus());
		System.out.println("Age of " +Full_name+" is : " + obj3.getAge());
		obj3.speciality = "neurosurgeon";
		System.out.format("%s has speciality in %s %n" , Full_name , obj3.speciality);



		//Parametric Constructor
		System.out.format("%n%n%n--------------Doctor's Parametric Costructor--------------%n%n");
		Doctor DoctorObject2 = new Doctor("Dr. Shree" , "Patel" , "Indian" ,"Female" , 23, "Dentist");
		Full_name = DoctorObject2.getName();
		System.out.println("Full name of Lecturer : " + Full_name);
		System.out.println(Full_name+ " is " + DoctorObject2.getGender());
		System.out.println(Full_name + " has Citizenship of " + DoctorObject2.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(DoctorObject2.getAge());
		
	}//end of main
}//end of Doctor class