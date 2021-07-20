/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a1809073
*   student (name): Raj patel
*
*
* Note: your are required to perform small changes, as accessors and mutators;
*
*/
public abstract class Person{
	protected String name;
	protected int age;
	
	Person(){
		this.name = "unnamed";
		this.age = 0;
	}

	/* implement accessors and mutators */

	public void setName(String n){
		this.name = n;
	}

	public void setAge(int a){
		this.age = a;
	}

	public int getAge(){
		return this.age;
	}

	public String getName(){
		return this.name;
	}
}