public class PersonClassImplementation{
	
	public static void main(String[] args) {
		
		
		//Default Constructor
		System.out.format("%n%n--------------Student Default Constructor--------------%n%n");
		student StudentObj1 = new student();
		StudentObj1.giveName("Raj");
		StudentObj1.lastName("Patel");
		StudentObj1.gender("Male");
		StudentObj1.citizenship("Indian");
		StudentObj1.age(23);
		String Full_name = StudentObj1.getName();
		System.out.print("Full name is : ");
		System.out.println(Full_name);
		String Person_gender = StudentObj1.getGender();
		System.out.print(Full_name+ " is ");
		System.out.println(Person_gender);
		String Person_citizen = StudentObj1.getCitizenshipStatus();
		System.out.print(Full_name + " has Citizenship of  ");
		System.out.println(Person_citizen);
		int Person_age = StudentObj1.getAge();
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(Person_age);
		double[] marks = {1,2,3,4,5,6,7,8,9,10};
		double average = StudentObj1.averageMarks(marks);
		System.out.format("The average of all the marks of %s is %.3f %n" ,Full_name, average);
		String[] disciplines1 = {"Silent", "oportunistic" , "Tough" , "Healthy"};
		System.out.println("The following are the disciplines of the " + Full_name);
		StudentObj1.displayDisciplines(disciplines1);
		

		//parametric Constructor Student
		System.out.format("%n%n%n--------------Student Parametric Constructor--------------%n%n");
		double[] input_marks = {12,12,14, 15, 16,17};
		String[] input_Disciplines = {"Happy" , "Curious"};
		student StudentObj2 = new student("Jay", "Patel" , "Indin", "Male" , 24 , input_marks,input_Disciplines);
		Full_name = StudentObj2.getName();
		System.out.println("Full name is : " + Full_name);
		System.out.println(Full_name+ " is " + StudentObj2.getGender());
		System.out.println(Full_name + " has Citizenship of  "+ StudentObj2.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println( StudentObj2.getAge());
		System.out.format("The average of all the marks of %s is %.3f %n" ,Full_name, StudentObj2.averageMarks(StudentObj2.marks));		
		StudentObj2.displayDisciplines(StudentObj2.disciplines);

		
		//Default Constructor Lecturer
		System.out.format("%n%n%n--------------Lecturer Default Constructor--------------%n%n");
		Lecturer LecturerObject1 = new Lecturer();
		LecturerObject1.giveName("Victor");
		LecturerObject1.lastName("Roy");
		LecturerObject1.gender("Male");
		LecturerObject1.citizenship("Canadian");
		LecturerObject1.age(56);
		Full_name = LecturerObject1.getName();
		System.out.println("Full name of Lecturer : " + Full_name);
		System.out.println(Full_name+ " is " + LecturerObject1.getGender());
		System.out.println(Full_name + " has Citizenship of " + LecturerObject1.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(LecturerObject1.getAge());
		double salary_Lecturer = 13000;
		LecturerObject1.setSalary(salary_Lecturer);
		double AnualSalary = LecturerObject1.annualSalary();
		System.out.format("The monthly salary of %s is $ %.3f %n" , Full_name , LecturerObject1.salary);
		System.out.format("The anual salary of %s is $ %.3f %n" , Full_name , AnualSalary);
		String [] disciplines = {"Silent", "oportunistic" , "Tough" , "Healthy"};
		System.out.println("The following are the disciplines of the " + Full_name);
		LecturerObject1.displayDisciplines(disciplines);


		//parametric constructor Lecturer
		System.out.format("%n%n%n--------------Lecturer Parametric Costructor--------------%n%n");
		Lecturer LecturerObject2 = new Lecturer("Shree" , "Patel" , "Indian" ,"Female" , 23, 140000 , disciplines );
		Full_name = LecturerObject2.getName();
		System.out.println("Full name of Lecturer : " + Full_name);
		System.out.println(Full_name+ " is " + LecturerObject2.getGender());
		System.out.println(Full_name + " has Citizenship of " + LecturerObject2.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(LecturerObject2.getAge());
		System.out.format("The monthly salary of %s is $ %.3f %n" , Full_name , LecturerObject2.salary);
		System.out.format("The anual salary of %s is $ %.3f %n" , Full_name , LecturerObject2.annualSalary());
		System.out.println("The following are the disciplines of the " + Full_name);
		LecturerObject2.displayDisciplines(disciplines);


		//Default Constructor Doctor 		
		System.out.format("%n%n%n--------------Doctor's Default Constructor--------------%n%n");
		Doctor DoctorsObject1 = new Doctor();
		DoctorsObject1.giveName("Dr. Ameya");
		DoctorsObject1.lastName("rama");
		DoctorsObject1.gender("Male");
		DoctorsObject1.citizenship("Australian");
		DoctorsObject1.age(46);
		Full_name = DoctorsObject1.getName();
		System.out.print("Full name : ");
		System.out.println(Full_name);
		System.out.println(Full_name+ " is " + DoctorsObject1.getGender());
		System.out.println(Full_name + " has Citizenship of "+ DoctorsObject1.getCitizenshipStatus());
		System.out.println("Age of " +Full_name+" is : " + DoctorsObject1.getAge());
		DoctorsObject1.speciality = "neurosurgeon";
		System.out.format("%s has speciality in %s %n" , Full_name , DoctorsObject1.speciality);


		//Parametric Constructor Doctor
		System.out.format("%n%n%n--------------Doctor's Parametric Costructor--------------%n%n");
		Doctor DoctorObject2 = new Doctor("Dr. Shree" , "Patel" , "Indian" ,"Female" , 23, "Dentist");
		Full_name = DoctorObject2.getName();
		System.out.println("Full name of Lecturer : " + Full_name);
		System.out.println(Full_name+ " is " + DoctorObject2.getGender());
		System.out.println(Full_name + " has Citizenship of " + DoctorObject2.getCitizenshipStatus());
		System.out.print("Age of " +Full_name+" is : ");
		System.out.println(DoctorObject2.getAge());


		//Parametric Constructor Patient
		System.out.format("%n%n%n--------------Patient Parametric Constructor--------------%n%n");
		Patient PatientObject1 = new Patient("Isshi","Gerula","India" , "Female"  ,19, "Regular Checkup" , "7" , "Small bites on hands" );
		System.out.format("Full name of Patient: %s. %n", PatientObject1.getName());
		System.out.format("%s is %s. %n" , PatientObject1.getName() , PatientObject1.getGender());
		System.out.format("%s has Citizenship of  %s. %n" ,PatientObject1.getName() , PatientObject1.getCitizenshipStatus() );
		System.out.format("Age of %s is %d. %n" ,PatientObject1.getName()  , PatientObject1.getAge());		
		System.out.format("Patient has came for : %s. %n" , PatientObject1.diagnostic);		
		System.out.format("Patient has visited %s times. %n" , PatientObject1.inTime);
		System.out.format("Patient had came preivious time for : %s. %n" , PatientObject1.prevTime);
		
	

	}//main

}//PersonClassImplementation 