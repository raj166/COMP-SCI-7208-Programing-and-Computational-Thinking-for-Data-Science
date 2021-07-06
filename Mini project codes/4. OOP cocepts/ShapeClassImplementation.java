public class ShapeClassImplementation{
	
	public static void main(String[] args) {
	
		//Default Constructor
		System.out.format("%n->Rectangle Default Constructor %n%n");
		Rectangle RectangleObject1 = new Rectangle();
		RectangleObject1.setWidth(20.3f);
		RectangleObject1.setLength(11.3f);
		System.out.format("The area of Rectangle with length %.2f and Width %.2f is %.3f", RectangleObject1.getLength(), RectangleObject1.getWidth(), RectangleObject1.area());


		//Parametric Constructor
		System.out.format("%n%n%n->Rectangle Parametric Constructor %n%n");
		Rectangle RectangleObject2 = new Rectangle(12.3f , 13.4f);
		System.out.format("The area of Rectangle with length %.2f and Width %.2f is %.3f", RectangleObject2.getLength(), RectangleObject2.getWidth(), RectangleObject2.area());


		//Default Constructor
		System.out.format("%n%n%n->Circle Default Constructor %n%n");
		Circle CircleObject1 = new Circle();
		CircleObject1.setRadius(20.3f);
		System.out.format("The area of Circle with radius %.2f is %.3f", CircleObject1.getRadius(), CircleObject1.area());


		//Parametric Constructor
		System.out.format("%n%n%n->Circle Parametric Constructor %n%n");
		Circle CircleObject2 = new Circle(12.3f);
		System.out.format("The area of Circle with radius %.2f is %.3f%n", CircleObject2.getRadius(), CircleObject2.area());



		//Default Constructor
		System.out.format("%n->Triangle Default Constructor%n%n");
		Triangle TraingleObject1 = new Triangle();
		TraingleObject1.setBase(20.3f);
		TraingleObject1.setHeight(11.3f);
		System.out.format("The area of Triangle with Base %.2f and height %.2f is %.3f%n", TraingleObject1.getbase(), TraingleObject1.getHeight(), TraingleObject1.area());


		//Parametric Constructor
		System.out.format("%n->Triangle Parametric Constructor%n%n ");
		Triangle TraingleObject2 = new Triangle(12.3f , 13.4f);
		System.out.format("The area of Triangle with Base %.2f and height %.2f is %.3f %n%n%n", TraingleObject2.getbase(), TraingleObject2.getHeight(), TraingleObject2.area());
		
	}//main

}//ShapeClassImplementation