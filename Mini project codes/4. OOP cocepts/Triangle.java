public class Triangle extends shape{
	
	double base;

	//Default Constructor
	Triangle(){
		this.base = 0;
	}

	//Parametric Constructor
	Triangle(double b , double h){
		super.height = h;
		this.base = b;
	}

	//Mutators
	public void setBase(double b){
		this.base = b;

	}

	//Accessors
	public double getbase(){
		return this.base;
	}

	//area method
	public double area(){
		return 0.5 *this.base * super.height;

	}

	public static void main(String[] args) {

		//Default Constructor
		System.out.format("%n%n------------------Default Constructor--------------%n");
		Triangle obj2 = new Triangle();
		obj2.setBase(20.3f);
		obj2.setHeight(11.3f);
		System.out.format("The area of Triangle with Base %.2f and height %.2f is %.3f %n", obj2.getbase(), obj2.getHeight(), obj2.area());
		System.out.println("");


		//Parametric Constructor
		System.out.format("%n%n------------------Parametric Constructor--------------%n");
		Triangle obj1 = new Triangle(12.3f , 13.4f);
		System.out.format("The area of Triangle with Base %.2f and height %.2f is %.3f %n", obj1.getbase(), obj1.getHeight(), obj1.area());
		


		

	}//end of main
}//end of Triangle classs