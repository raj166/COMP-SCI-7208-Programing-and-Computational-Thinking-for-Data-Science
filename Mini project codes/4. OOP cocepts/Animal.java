public class Animal{
	
	//Attributes
	String name, favouriteFood;
	double weight;
	int age;
	

	//default Constructors
	Animal(){
		this.name ="unkown";
		this.favouriteFood ="unkown" ;
		this.weight = 0;
		this.age = 0;
	}

	//parametric Constructors
	Animal(String n , String f , double w , int a){
		this.name = n;
		this.favouriteFood = f ;
		this.weight = w;
		this.age = a;
	}


	//Mutators
	void setName(String n){
		this.name = n;
	}

	void setFavouriteFood(String f){
		this.favouriteFood = f;
	}

	void setAge(int a){
		this.age = a;
	}

	void setWeigth(double w){
		this.weight = w;
	}



	//Accessors
	String getName(){
		return this.name;
	}

	String getFavouriteFood(){
		return this.favouriteFood;
	}

	int getAge(){
		return this.age;
	}

	double getWeigth(){
		return this.weight;
	}



}