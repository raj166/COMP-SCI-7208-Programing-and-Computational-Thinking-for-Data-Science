public class Book{
	
	//attributes
	String title;
	int year;
	String Publish;
	int pages;

	//default Constructor
	Book(){
		this.title = "Unknown";
		this.year = 0;
		this.Publish = "Unknown";
		this.pages = 0;

	}

	//parametric Constructor
	Book(String t , int y , String p, int page){
		this.title = t;
		this.year = y;
		this.Publish = p;
		this.pages = page;
	}//end of book paramterized Constructor


	//Mutators
	void setTitle(String s){
		this.title = s;

	}

	void setYear(int y){
		this.year = y;
	}

	void setPublish(String p){
		this.Publish =p;
	}

	void setPages(int page){
		this.pages = page;
	}


	//Accessors
	String getTitle(){
		return this.title ;
	}

	int getYear(){
		return this.year ;
	}

	String getPublish(){
		return this.Publish ;
	}

	int getPages(){
		return this.pages ;
	}

}