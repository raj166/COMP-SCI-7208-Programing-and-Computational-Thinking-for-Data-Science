public class AniamlClassImplementation{
	public static void main(String[] args) {
		
		//default Constructor
		System.out.println("------------------Basic Constructor--------------");
		Lion LionObject1 = new Lion();
		LionObject1.setName("Simba");
		LionObject1.setFavouriteFood("Meat");
		LionObject1.setAge(12);
		LionObject1.setWeigth(78.34f);
		System.out.println("The name of lion is : "+LionObject1.getName()+".");
		System.out.println(LionObject1.getName() +"'s Favourite Food is "+LionObject1.getFavouriteFood()+".");
		System.out.println(LionObject1.getName() +"'s age is "+LionObject1.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",LionObject1.getName(),LionObject1.getWeigth());
		System.out.println(LionObject1.getName() +" makes "+LionObject1.makeSound()+" sound.");

		System.out.println("");

		//Parametric Constructor
		System.out.println("------------------Parametric Constructor--------------");
		Lion LionObject2 = new Lion("Rambo" , "Goat's meat" , 89.35f , 24);
		System.out.println("The name of lion is : "+LionObject2.getName()+".");
		System.out.println(LionObject2.getName() +"'s Favourite Food is "+LionObject2.getFavouriteFood()+".");
		System.out.println(LionObject2.getName() +"'s age is "+LionObject2.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",LionObject2.getName(),LionObject2.getWeigth());
		System.out.println(LionObject2.getName() +" makes "+LionObject2.makeSound()+" sound.");
		System.out.println("");

		//default Constructor
		System.out.println("------------------Basic Constructor--------------");
		Turtle TurtleObject1 = new Turtle();
		TurtleObject1.setName("Mitu");
		TurtleObject1.setFavouriteFood("leaf");
		TurtleObject1.setAge(12);
		TurtleObject1.setWeigth(8.34f);

		System.out.println("The name of Turtle is : "+TurtleObject1.getName()+".");
		System.out.println(TurtleObject1.getName() +"'s Favourite Food is "+TurtleObject1.getFavouriteFood()+".");
		System.out.println(TurtleObject1.getName() +"'s age is "+TurtleObject1.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",TurtleObject1.getName(),TurtleObject1.getWeigth());
		System.out.println(TurtleObject1.getName() +" makes "+TurtleObject1.makeSound()+" sound.");
		System.out.println("");

		
		//Parametric Constructor
		System.out.println("------------------Parametric Constructor--------------");
		Turtle TurtleObject2 = new Turtle("pinku" , "palak leaf" , 9.35f , 21);

		System.out.println("The name of Turtle is : "+TurtleObject2.getName()+".");
		System.out.println(TurtleObject2.getName() +"'s Favourite Food is "+TurtleObject2.getFavouriteFood()+".");
		System.out.println(TurtleObject2.getName() +"'s age is "+TurtleObject2.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",TurtleObject2.getName(),TurtleObject2.getWeigth());
		System.out.println(TurtleObject2.getName() +" makes "+TurtleObject2.makeSound()+" sound.");
		System.out.println("");

		//default Constructor
		System.out.println("------------------Basic Constructor--------------");
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
		System.out.println("");

		
		//Parametric Constructor
		System.out.println("------------------Parametric Constructor--------------");
		Chameleon obj2 = new Chameleon("Rimsi" , "insects from leaf" , 0.65f , 1);

		System.out.println("The name of Chameleon is : "+obj2.getName()+".");
		System.out.println(obj2.getName() +"'s Favourite Food is "+obj2.getFavouriteFood()+".");
		System.out.println(obj2.getName() +"'s age is "+obj2.getAge()+".");
		System.out.format("%s's weight is %.2f. %n",obj2.getName(),obj2.getWeigth());
		System.out.println(obj2.getName() +" makes "+obj2.makeSound()+" sound.");
		System.out.println("");

	}
}