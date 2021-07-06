public class student extends Person{
	
	//array to store makrs and disciplines
	double [] marks;
	String [] disciplines;


	//Default constructor
	student(){

		this.marks = new double[0];
		this.disciplines = new String[0];
	}


	//parateric constructor
	student(String name , String last_name , String citizen , String gender , int age, double[] input_marks , String[] input_Disciplines ){
		super(name , last_name , citizen , gender , age);
		this.marks = new double[input_marks.length];
		this.disciplines = new String[input_Disciplines.length];
		
		for (int i =0; i<input_marks.length ; i++ ){
			this.marks[i] = input_marks[i];
		}

		for (int i =0; i<input_Disciplines.length ; i++ ){
			this.disciplines[i] = input_Disciplines[i];
		}
	}


	//to set the array marks 
	public void setMarks(double[] input_marks){
		this.marks = new double[input_marks.length];
		for (int i =0; i<input_marks.length ; i++ ){
			this.marks[i] = input_marks[i];
		}
	}


	//get the array of marks 
	public double[] getMarks(){
		return this.marks;
	}


	//set the disciplines
	public void setDisciplines(String[] input_Disciplines){
		this.disciplines = new String[input_Disciplines.length];
		for (int i =0; i<input_Disciplines.length ; i++ ) {
			this.disciplines[i] = input_Disciplines[i];
		}
	}


	//getDisciplines
	public String[] getDisciplines(){
		return this.disciplines;
	}


	//calculate the average marks using the array as arguement 
	public double averageMarks(double [] marks){
		double sum = 0;
		for (int i =0; i<marks.length ;i++ ) {
			sum = sum + marks[i];
		}
		double average = (double)sum / marks.length; 

		return average;
	}//end of averageMarks



	//displayDisciplines
	public void displayDisciplines(String [] disciplines){
		for (int i =0; i<disciplines.length ;i++ ) {
			System.out.println(disciplines[i]);
		}
	}//end of displayDisciplines



	//main method
	public static void main(String[] args) {
		
		System.out.format("%n%n%n---------Student Default Constructor---------%n");
		

		//Default Constructor
		student obj1 = new student();
		
		obj1.giveName("Raj");
		obj1.lastName("Patel");
		obj1.gender("Male");
		obj1.citizenship("Indian");
		obj1.age(23);


		String Full_name = obj1.getName();
		System.out.print("Full name is : ");
		System.out.println(Full_name);

		String Person_gender = obj1.getGender();
		System.out.print(Full_name+ " is ");
		System.out.println(Person_gender);

		String Person_citizen = obj1.getCitizenshipStatus();
		System.out.print(Full_name + " has Citizenship of  ");
		System.out.println(Person_citizen);

		int Person_age = obj1.getAge();
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(Person_age);

		double[] marks = {1,2,3,4,5,6,7,8,9,10};
		double average = obj1.averageMarks(marks);
		System.out.format("The average of all the marks of %s is %.3f %n" ,Full_name, average);

		String[] disciplines1 = {"Silent", "oportunistic" , "Tough" , "Healthy"};
		System.out.println("The following are the disciplines of the " + Full_name);
		obj1.displayDisciplines(disciplines1);
		

		//parametric Constructor
		System.out.format("%n%n%n---------parametric Constructor Student---------%n");

		double[] input_marks = {12,12,14, 15, 16,17};
		String[] input_Disciplines = {"Happy" , "Curious"};
		student obj11 = new student("Jay", "Patel" , "Indin", "Male" , 24 , input_marks,input_Disciplines);
		

		Full_name = obj11.getName();
		System.out.println("Full name is : " + Full_name);
		
		System.out.println(Full_name+ " is " + obj11.getGender());
	
		System.out.println(Full_name + " has Citizenship of  "+ obj11.getCitizenshipStatus());

		System.out.print("Age of " +Full_name+" is : ");
		
		System.out.println( obj11.getAge());

		System.out.format("The average of all the marks of %s is %.3f %n" ,Full_name, obj11.averageMarks(obj11.marks));
		
		obj11.displayDisciplines(obj11.disciplines);

	}//main

}//student
