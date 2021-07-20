/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a1809073
*   student (name): Raj patel
*
* Note: your are required to perform small changes, as accessors and mutators;
*
*/
public class Employee extends Person{
	protected int hoursPerWeek;
	protected float dollarsPerHours;
	protected int workedYears;

	public int getHoursPerWeek(){
		return hoursPerWeek;
	}

	public int getWorkedYears(){
		return workedYears;
	}

	public float GetDollarsPerHours(){
		return dollarsPerHours;
	}

	public void getHoursPerWeek(int i){
		this.hoursPerWeek = i;
	}

	public void getWorkedYears(int i){
		this.workedYears = i ;
	}

	public void GetDollarsPerHours(float i){
		this.dollarsPerHours = i;
	}

	Employee(){
		this.name = "new-employee";
		this.hoursPerWeek = 0;
		this.dollarsPerHours = 0f;
		this.workedYears = 0;
	}
	Employee(String name, int age, int hoursPerWeek, float dollarsPerHours, int workedYears){
		this.name = name;
		this.age = age;
		this.hoursPerWeek = hoursPerWeek;
		this.dollarsPerHours = dollarsPerHours;
		this.workedYears = workedYears;
	}

	public void display(){
		int field = 8;
		String ans = ":: ";
		ans += this.name;
		ans += String.format("% "+ (30 - this.name.length()) + "d", this.age);
		ans += String.format("%8d", this.hoursPerWeek);
		ans += String.format("%10.1f", this.dollarsPerHours);
		ans += String.format("%8d", this.workedYears);
		System.out.println(ans);

	}

	/* implement accessors and mutators */

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

}