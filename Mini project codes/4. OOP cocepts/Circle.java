import java.lang.Math.*;

public class Circle extends shape{

	//default Constructor
	Circle(){
		super.radius = 0;
	}

	// /Parametric Constructor
	Circle(double r){
		super.radius = r;
	}

	//method area
	public double area(){
		return Math.PI * super.radius * super.radius ;
	}

	public static void main(String[] args) {
		
		//default Constructor
		System.out.format("%n------------------default Constructor--------------%n");
		Circle obj2 = new Circle();
		obj2.setRadius(20.3f);
		System.out.format("The area of Circle with radius %.2f is %.3f %n", obj2.getRadius(), obj2.area());

		//Parametric Constructor
		System.out.format("%n%n------------------Parametric Constructor--------------%n");
		Circle obj1 = new Circle(12.3f);
		System.out.format("The area of Circle with radius %.2f is %.3f %n", obj1.getRadius(), obj1.area());
	}//end of main
}//end of Circle class