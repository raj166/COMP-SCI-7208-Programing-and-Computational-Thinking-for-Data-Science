public class PlayerDriver{
    public static void main(String args[]){
	// make some Players
	Player p1 = new Player("Sally Smith",18,0,0);
	Player p2 = new Player("Jane Austen",23,7,3);
	Player p3 = new Player("Spiro Agnew",76,9,8);

	// print some players
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

	// change some players
	p1.setName("Sarah Smith");
	p1.setAge(18);
	p3.setAge(77);
	p1.win();
	p2.lose();
	p1.lose();
	p3.win();

	// print some players  again
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);

	// print out some values
	
    System.out.println(p1.getAge());
	System.out.println(p2.getName());
	System.out.println(p3.getAge());
	System.out.println(p3.getRanking());
	System.out.println(p1.getRanking());
	System.out.println(p2.getId());

    }

       
}
