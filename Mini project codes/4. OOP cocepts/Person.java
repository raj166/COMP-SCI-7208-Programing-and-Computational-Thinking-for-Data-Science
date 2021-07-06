public class Person{

	String Name,last_name,citizenship_status,sex;
	int Age;

	//Default Constructor
	public Person(){
		this.Name = "Unknown";
		this.last_name = "Unknown";
		this.citizenship_status = "Unknown";
		this.sex = "Unknown";
		this.Age = 0;
	}

	//parametric Constructor
	public Person(String n , String l , String c , String g , int a){
		this.Name = n;
		this.last_name = l;
		this.citizenship_status = c;
		this.sex = g;
		this.Age = a;
	}

	public void giveName(String s){
		this.Name = s;

	}

	public void lastName(String s){
		this.last_name = s;
	}

	public void gender(String s){
		this.sex = s;
	}

	public void citizenship(String s){
		this.citizenship_status = s;
	}

	public void age(int a){
		this.Age = a;
	}

	public String getName(){
		String Full_name = this.Name + " " + this.last_name;
		return Full_name;
	}

	public String getGender(){
		return this.sex;
	}

	public String getCitizenshipStatus(){
		return this.citizenship_status;
	}

	public int getAge(){
		return Age;
	}

}//end of person class