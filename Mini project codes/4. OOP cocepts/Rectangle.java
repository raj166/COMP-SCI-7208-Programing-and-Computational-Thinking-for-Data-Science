public class Rectangle extends shape{

	//Default Constructor
	Rectangle(){
		super.length = 0;
		super.width = 0;
	}

	//Parametric Constructor
	Rectangle(double l , double w){
		super.length = l;
		super.width = w;
	}
	
	//methods
	public double area(){
		return super.length*super.width;
	}//end of area method

	public static void main(String[] args) {

		//Default Constructor
		System.out.format("%n------------------Default Constructor--------------%n");
		Rectangle obj2 = new Rectangle();
		obj2.setWidth(20.3f);
		obj2.setLength(11.3f);
		System.out.format("The area of Rectangle with length %.2f and Width %.2f is %.3f %n", obj2.getLength(), obj2.getWidth(), obj2.area());
		System.out.println("");


		//Parametric Constructor
		System.out.format("%n%n------------------Parametric Constructor--------------%n");
		Rectangle obj1 = new Rectangle(12.3f , 13.4f);
		System.out.format("The area of Rectangle with length %.2f and Width %.2f is %.3f %n%n%n", obj1.getLength(), obj1.getWidth(), obj1.area());
	}//end of main
}//end of Rectangle class