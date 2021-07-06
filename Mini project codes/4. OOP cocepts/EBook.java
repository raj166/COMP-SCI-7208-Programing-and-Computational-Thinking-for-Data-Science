public class EBook extends Book{
	
	String url;

	//default Constructor
	EBook(){
		this.url = "Invalid Url";
	}

	//parametric Constructor
	EBook(String u , String t , int y , String p, int page){
		super(t,y,p,page);
		this.url = u;
	}

	//Mutators
	public void setURL(String u){
		this.url = u;
	}

	//Accessors
	public String getURL(){
		return this.url;
	}

	public static void main(String[] args) {
		
		System.out.format("%n%n------------------EBook default Constructor--------------%n");
		EBook obj1 = new EBook();
		String url = "Https://ThisIsTheLinkToBook.html";
		obj1.setURL(url);
		obj1.setTitle("The last man standing");
		obj1.setYear(2006);
		obj1.setPublish("Books.com");
		obj1.setPages(365);

		System.out.println("The title of the book is " + obj1.getTitle() + ".");
		System.out.format("The link to the book is: %s %n",obj1.getURL() );
		System.out.println("The book was publised in year "+obj1.getYear() + ".");
		System.out.println("The Publisher is "+obj1.getPublish() + ".");
		System.out.println("Number of pages in the book "+obj1.getPages() + ".");

		//Parametric constructor
		System.out.format("%n%n%n------------------EBook Parametric Constructor--------------%n");
		String url2 = "Https://ThisIsTheLinkToBook2.html";
		EBook obj2 = new EBook(url2 , "The Boat" , 2019 ,"Local_store", 231);
		System.out.println("The title of the book is " + obj2.getTitle() + ".");
		System.out.format("The link to the book is: %s %n",obj2.getURL() );
		System.out.println("The book was publised in year "+obj2.getYear() + ".");
		System.out.println("The Publisher is "+obj2.getPublish() + ".");
		System.out.println("Number of pages in the book "+obj2.getPages() + ".");

	}//end of main
}//end of EBook
