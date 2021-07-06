public class Chameleon extends Animal{

	//default Constructor
	Chameleon(){
		super.name = "Unkown";
		super.favouriteFood = "Unkown" ;
		super.weight = 0.0;
		super.age = 0;
	}

	//Parametric Constructor
	Chameleon(String n , String f , double w , int a){
		super.name = n;
		super.favouriteFood = f ;
		super.weight = w;
		super.age = a;

	}

	//method
	public String makeSound(){
		return "hiss hiss";
	}


	public static void main(String[] args) {
		

		//default Constructor
		System.out.format("%n%n%n------------------Chameleon default Constructor--------------%n");
		Chameleon obj1 = new Chameleon();
		obj1.setName("Mitu");
		obj1.setFavouriteFood("insects");
		obj1.setAge(1);
		obj1.setWeigth(0.50f);
		System.out.println("The name of Chameleon is : "+obj1.getName()+".");
		System.out.println(obj1.getName() +"'s Favourite Food is "+obj1.getFavouriteFood()+".");
		System.out.println(obj1.getName() +"'s age is "+obj1.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj1.getName(),obj1.getWeigth());
		System.out.println(obj1.getName() +" makes "+obj1.makeSound()+" sound.");

		
		//Parametric Constructor
		System.out.format("%n%n%n------------------Chameleon Parametric Constructor--------------%n");
		Chameleon obj2 = new Chameleon("Rimsi" , "insects from leaf" , 0.65f , 1);

		System.out.println("The name of Chameleon is : "+obj2.getName()+".");
		System.out.println(obj2.getName() +"'s Favourite Food is "+obj2.getFavouriteFood()+".");
		System.out.println(obj2.getName() +"'s age is "+obj2.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj2.getName(),obj2.getWeigth());
		System.out.println(obj2.getName() +" makes "+obj2.makeSound()+" sound.");
		
	}//end of main
}//end of Chameleon
