//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

public class Student{
	String name;
	int physic, chemistry, math;
	double average;

	//cunstructors	
	Student(){
		this.average = 0.0;
	}

	Student(String name, int physic, int chemistry, int math){
		this.name = name;
		this.average = (physic+chemistry+math)/3.0;
		this.average = Math.round(this.average*100)/100.00;
		this.physic = physic;
		this.chemistry = chemistry;
		this.math = math;
	}

	//Mutators
	public void set_name(String name){
		this.name = name;
	}

	public void set_physic(int marks){
		this.physic = marks;
	}

	public void set_chemistry(int marks){
		this.chemistry = marks;
	}

	public void set_math(int marks){
		this.math = marks;
	}

	public void set_average(double marks){
		this.average = marks;
	}

	//Acessors
	public String get_name(){
		return this.name;
	}

	public int get_physic(){
		return this.physic;
	}

	public int get_chemistry(){
		return this.chemistry;
	}

	public int get_math(){
		return this.math;
	}

	public double get_average(){
		return this.average;
	}



}