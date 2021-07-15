public class ClubDriver{

    public static void main(String args[]){

	// set up two new clubs.
	Club club1 = new Club();
	Club club2 = new Club();

	// set up some new players
	Player p1 = new Player("Sally Smith",18,0,0);
	Player p2 = new Player("Jane Austen",23,7,3);
	Player p3 = new Player("Spiro Agnew",76,9,8);
	Player p4 = new Player("Jenny Lee",33,10,8);
	Player p5 = new Player("Yasi Jones",53,3,2);

	// add these players to club 1

	club1.addMember(p1);
	club1.addMember(p2);
	club1.addMember(p5);

	// and some players to club 2 (p1 in both clubs!)

	club2.addMember(p1);
	club2.addMember(p3);
	club2.addMember(p4);

	// print Members of each club
	System.out.println("Club 1");
	club1.printMembers();
	System.out.println("Club 2");
	club2.printMembers();

	// players play
	p1.win();
	p2.lose();
	p3.win();
	p3.win();
	p4.lose();
	p5.win();
	p5.win();

	// print Members of each club
	System.out.println("Club 1");
	club1.printMembers();
	System.out.println("Club 2");
	club2.printMembers();

	// try to remove members from clubs
	
	System.out.println(club1.removeMemberById(1));
	System.out.println(club2.removeMemberById(2));

	// print Members of each club again
	System.out.println("Club 1");
	club1.printMembers();
	System.out.println("Club 2");
	club2.printMembers();

	// get highest ranked player in both clubs
	System.out.println("Highest Ranked Players");
	System.out.println(club1.getHighestRankedPlayer());
	System.out.println(club2.getHighestRankedPlayer());
    }
}
