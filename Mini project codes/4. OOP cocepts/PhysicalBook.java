public class PhysicalBook extends Book{
	
	//attributes
	public int shelf , aisle, floor;

	//Default Constroctor
	PhysicalBook(){
		this.shelf =0;
		this.aisle =0;
		this.floor=0;
	}

	//Parametric Constructor
	PhysicalBook(int s , int a , int f ,String t , int y , String p, int page){
		super(t,y,p,page);
		this.shelf =s;
		this.aisle =a;
		this.floor=f;
	}


	//Mutators
	public void setShelf(int s){
		this.shelf = s;
	}

	public void setAisle(int a){
		this.aisle = a;
	}

	public void setFloor(int f){
		this.floor = f;
	}


	//Accessors
	public int getShelf(){
		return this.shelf;
	}

	public int getAisle(){
		return this.aisle;
	}

	public int getFloor(){
		return this.floor;
	}


	//Method 
	public void displayBookLocation(){
		System.out.println("The self number of the book is:" + this.shelf+".");
		System.out.println("The aisle number of the book is: " + this.aisle+".");
		System.out.println("The floor number of the book is: " + this.floor+".");

	}

	public static void main(String[] args) {
		
		//Default Constructor
		System.out.format("%n%n------------------Physical Book Default Constructor--------------%n");

		PhysicalBook obj1 = new PhysicalBook();
		obj1.setTitle("The last man standing");
		obj1.setYear(2006);
		obj1.setPublish("Books.com");
		obj1.setPages(365);
		obj1.setShelf(12);
		obj1.setAisle (14);
		obj1.setFloor(15);
		

		System.out.println("The title of the book is " + obj1.getTitle() + ".");
		System.out.println("The book was publised in year "+obj1.getYear() + ".");
		System.out.println("The Publisher is "+obj1.getPublish() + ".");
		System.out.println("Number of pages in the book "+obj1.getPages() + ".");
		obj1.displayBookLocation();


		

		//using the parametric constructor
		System.out.format("%n%n%n------------------Physical Book Parametric Constructor--------------%n");
		PhysicalBook obj2 = new PhysicalBook(11,12,13 , "The Boat" , 2019 ,"Local_store", 231);
		System.out.println("The title of the book is " + obj2.getTitle() + ".");
		System.out.println("The book was publised in year "+obj2.getYear() + " ");
		System.out.println("The Publisher is "+obj2.getPublish() + ".");
		System.out.println("Number of pages in the book "+obj2.getPages() + ".");
		obj2.displayBookLocation();
		
	}//end of main

}//end of PhysicalBook class