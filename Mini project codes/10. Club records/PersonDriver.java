public class PersonDriver{
    public static void main(String args[]){
	// make some people
	Person p1 = new Person();
	Person p2 = new Person("Jane Austen",23);
	Person p3 = new Person("Spiro Agnew",76);

	// print some people
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

	// change some people
	p1.setName("Sally Smith");
	p1.setAge(18);
	p3.setAge(77);

	// print some people again
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

	// print out some values
	
       	System.out.println(p1.getAge());
	System.out.println(p2.getName());
	System.out.println(p3.getAge());
	
	

	

	
    }

       
}
