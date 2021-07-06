public class Lecturer extends Person{
	double salary;
	String [] disciplines;

	//default constructor
	Lecturer(){
	 	this.salary = 0;
	 	
	}
	
	//parametric Constructor
	Lecturer(String name , String last_name , String citizen , String gender , int age, double s , String [] input_Disciplines ){
		super(name , last_name , citizen , gender , age);
		this.salary = s;
		this.disciplines = new String[input_Disciplines.length];
		for (int i =0; i<input_Disciplines.length ; i++ ) {
			this.disciplines[i] = input_Disciplines[i];
		}
	}

	public void setSalary(double s){
		this.salary = s;
	}

	public double getSalary(){
		return this.salary;
	}

	public void setDisciplines(String[] input_Disciplines){
		this.disciplines = new String[input_Disciplines.length];
		for (int i =0; i<input_Disciplines.length ; i++ ) {
			this.disciplines[i] = input_Disciplines[i];
		}
	}

	public String[] getDisciplines(){
		return this.disciplines;
	}
	
	public double annualSalary(){
		return 12*this.salary;
	}//end of annualSalary

	public void displayDisciplines(String [] disciplines){
		for (int i =0; i<disciplines.length ;i++ ) {
			System.out.println(disciplines[i]);
		}
	}//end of displayDisciplines

	public static void main(String[] args) {

		//default Constructor
		System.out.format("%n%n%n---------Lecturer---------%n");
		Lecturer obj2 = new Lecturer();
		obj2.giveName("Victor");
		obj2.lastName("Roy");
		obj2.gender("Male");
		obj2.citizenship("Canadian");
		obj2.age(56);
		String Full_name = obj2.getName();
		System.out.println("Full name of Lecturer : " + Full_name);
		System.out.println(Full_name+ " is " + obj2.getGender());
		System.out.println(Full_name + " has Citizenship of " + obj2.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(obj2.getAge());
		double salary_Lecturer = 13000;
		obj2.setSalary(salary_Lecturer);
		double AnualSalary = obj2.annualSalary();
		System.out.format("The monthly salary of %s is $ %.3f %n" , Full_name , obj2.salary);
		System.out.format("The anual salary of %s is $ %.3f %n" , Full_name , AnualSalary);
		String [] disciplines = {"Silent", "oportunistic" , "Tough" , "Healthy"};
		System.out.println("The following are the disciplines of the " + Full_name);
		obj2.displayDisciplines(disciplines);



		//parametric constructor
		System.out.format("%n%n%n--------------Parametric Costructor--------------%n");
		Lecturer obj3 = new Lecturer("Shree" , "Patel" , "Indian" ,"Female" , 23, 140000 , disciplines );
		Full_name = obj3.getName();
		System.out.println("Full name of Lecturer : " + Full_name);
		System.out.println(Full_name+ " is " + obj3.getGender());
		System.out.println(Full_name + " has Citizenship of " + obj3.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(obj3.getAge());
		System.out.format("The monthly salary of %s is $ %.3f %n" , Full_name , obj3.salary);
		System.out.format("The anual salary of %s is $ %.3f %n" , Full_name , obj3.annualSalary());
		System.out.println("The following are the disciplines of the " + Full_name);
		obj3.displayDisciplines(disciplines);
		
	}//end of main
}//end of Lecturer class