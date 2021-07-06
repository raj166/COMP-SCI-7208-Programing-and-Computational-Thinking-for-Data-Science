class shape{
	//Attributes
	double width, height, radius, length;

	//Default Constructor
	shape(){
		this.width = 0;
		this.height = 0;
		this.radius = 0;
		this.length = 0;

	}

	//Parametric Constructor
	shape(double w , double h , double r , double l){
		this.width = w;
		this.height = h;
		this.radius = r;
		this.length = l;
	}


	//Accessors
	double getWidth(){
		return this.width;
	}

	double getLength(){
		return this.length;
	}

	double getRadius(){
		return this.radius;
	}

	double getHeight(){
		return this.height;
	}


	//Mutators
	void  setWidth(double w){
		this.width =w;
	}

	void  setLength(double l){
		this.length =l;
	}

	void setRadius(double r){
		this.radius = r;
	}

	void setHeight(double h){
		this.height = h ;
	}


}//end of shape