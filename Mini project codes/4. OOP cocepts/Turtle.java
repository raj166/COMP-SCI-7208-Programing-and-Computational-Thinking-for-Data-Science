public class Turtle extends Animal{
	
	//Default Constructor
	Turtle(){
		super.name = "Unkown";
		super.favouriteFood = "Unkown" ;
		super.weight = 0.0;
		super.age = 0;
	}

	//Parametric Constructor
	Turtle(String n , String f , double w , int a){
		super.name = n;
		super.favouriteFood = f ;
		super.weight = w;
		super.age = a;

	}

	//method
	public String makeSound(){
		return "whining";
	}


	public static void main(String[] args) {
		

		//Default Constructor
		System.out.format("%n%n%n------------------Turtle Default Constructor--------------%n");
		Turtle obj1 = new Turtle();
		obj1.setName("Mitu");
		obj1.setFavouriteFood("leaf");
		obj1.setAge(12);
		obj1.setWeigth(8.34f);
		System.out.println("The name of Turtle is : "+obj1.getName()+".");
		System.out.println(obj1.getName() +"'s Favourite Food is "+obj1.getFavouriteFood()+".");
		System.out.println(obj1.getName() +"'s age is "+obj1.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj1.getName(),obj1.getWeigth());
		System.out.println(obj1.getName() +" makes "+obj1.makeSound()+" sound.");

		
		//Parametric Constructor
		System.out.format("%n%n%n------------------Turtle Parametric Constructor--------------%n");
		Turtle obj2 = new Turtle("pinku" , "palak leaf" , 9.35f , 21);
		System.out.println("The name of Turtle is : "+obj2.getName()+".");
		System.out.println(obj2.getName() +"'s Favourite Food is "+obj2.getFavouriteFood()+".");
		System.out.println(obj2.getName() +"'s age is "+obj2.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj2.getName(),obj2.getWeigth());
		System.out.println(obj2.getName() +" makes "+obj2.makeSound()+" sound.");
		
	}//end of main
}//end of Turtle
