public class BookImplementation{
	
	public static void main(String[] args) {
		

		//default Constructor
		System.out.format("%n%n%n------------------Physical Book default Constructor--------------%n");
		PhysicalBook PhysicalBookObj1 = new PhysicalBook();
		PhysicalBookObj1.setTitle("The last man standing");
		PhysicalBookObj1.setYear(2006);
		PhysicalBookObj1.setPublish("Books.com");
		PhysicalBookObj1.setPages(365);
		PhysicalBookObj1.setShelf(12);
		PhysicalBookObj1.setAisle (14);
		PhysicalBookObj1.setFloor(15);
		System.out.println("The title of the book is " + PhysicalBookObj1.getTitle() + ".");
		System.out.println("The book was publised in year "+PhysicalBookObj1.getYear() + ".");
		System.out.println("The Publisher is "+PhysicalBookObj1.getPublish() + ".");
		System.out.println("Number of pages in the book "+PhysicalBookObj1.getPages() + ".");
		PhysicalBookObj1.displayBookLocation();


		//using the parametric constructor
		System.out.format("%n%n%n------------------Physical Book Parametric Constructor--------------%n");
		PhysicalBook PhysicalBookObj2 = new PhysicalBook(11,12,13 , "The Boat" , 2019 ,"Local_store", 231);
		System.out.println("The title of the book is " + PhysicalBookObj2.getTitle() + ".");
		System.out.println("The book was publised in year "+PhysicalBookObj2.getYear() + " ");
		System.out.println("The Publisher is "+PhysicalBookObj2.getPublish() + ".");
		System.out.println("Number of pages in the book "+PhysicalBookObj2.getPages() + ".");
		PhysicalBookObj2.displayBookLocation();


		//default Constructor
		System.out.format("%n%n%n------------------EBook default Constructor--------------%n");
		EBook obj1 = new EBook();
		String url = "Https://ThisIsTheLinkToBook.html";
		obj1.setURL(url);
		obj1.setTitle("The last man standing");
		obj1.setYear(2006);
		obj1.setPublish("Books.com");
		obj1.setPages(365);
		System.out.println("The title of the book is " + obj1.getTitle() + " .");
		System.out.format("The link to the book is: %s %n",obj1.getURL() );
		System.out.println("The book was publised in year "+obj1.getYear() + " .");
		System.out.println("The Publisher is "+obj1.getPublish() + " .");
		System.out.println("Number of pages in the book "+obj1.getPages() + " .");


		//Parametric constructor
		System.out.format("%n%n%n------------------EBook Parametric Constructor--------------%n");
		String url2 = "Https://ThisIsTheLinkToBook2.html";
		EBook obj2 = new EBook(url2 , "The Boat" , 2019 ,"Local_store", 231);
		System.out.println("The title of the book is " + obj2.getTitle() + " .");
		System.out.format("The link to the book is: %s %n",obj2.getURL() );
		System.out.println("The book was publised in year "+obj2.getYear() + " .");
		System.out.println("The Publisher is "+obj2.getPublish() + " .");
		System.out.println("Number of pages in the book "+obj2.getPages() + " .");
		
	}
}