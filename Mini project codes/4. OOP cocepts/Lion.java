public class Lion extends Animal{

	//default Constructor
	Lion(){
		super.name = "Unkown";
		super.favouriteFood = "Unkown" ;
		super.weight = 0.0;
		super.age = 0;
	}

	//Parametric Constructor
	Lion(String n , String f , double w , int a){
		super.name = n;
		super.favouriteFood = f ;
		super.weight = w;
		super.age = a;

	}

	//method
	public String makeSound(){
		return "Roaring";
	}


	public static void main(String[] args) {
		

		//default Constructor
		System.out.format("%n%n%n------------------Default Constructor--------------%n");
		Lion obj1 = new Lion();
		obj1.setName("Simba");
		obj1.setFavouriteFood("Meat");
		obj1.setAge(12);
		obj1.setWeigth(78.34f);
		System.out.println("The name of lion is : "+obj1.getName()+".");
		System.out.println(obj1.getName() +"'s Favourite Food is "+obj1.getFavouriteFood()+".");
		System.out.println(obj1.getName() +"'s age is "+obj1.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj1.getName(),obj1.getWeigth());
		System.out.println(obj1.getName() +" makes "+obj1.makeSound()+" sound.");


		//Parametric Constructor
		System.out.format("%n%n%n------------------Parametric Constructor--------------%n");
		Lion obj2 = new Lion("Rambo" , "Goat's meat" , 89.35f , 24);
		System.out.println("The name of lion is : "+obj2.getName()+".");
		System.out.println(obj2.getName() +"'s Favourite Food is "+obj2.getFavouriteFood()+".");
		System.out.println(obj2.getName() +"'s age is "+obj2.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj2.getName(),obj2.getWeigth());
		System.out.println(obj2.getName() +" makes "+obj2.makeSound()+" sound.");



	}//end of main
}//end of Lion class