/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a111111
*   student (name): John Smitth
*
*
* Note: in order to finish your exam you are NOT required to make any changes in this class
* ** Warning ** : The changes performed on this file will not be marked or considered for marking;
*/
import java.util.Scanner;
import java.io.IOException;

public class Main{

	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	} 

	public static void waitInput(Scanner scan){
		String ans = "\n\n\n";
     	ans += "                        Press any key to continue . . .      " + "\n";
		ans += "===============================================================================" + "\n";
		System.out.println(ans);
     	scan.nextLine();
	}

	public static String getHeader(boolean toPrint){
		String ans = "\n\n\n";
		ans += "===============================================================================" + "\n";
		ans += ":: Management System of Hungry Donalds                                       ::" + "\n";
		ans += "===============================================================================" + "\n";
		if(toPrint)
			System.out.println(ans);
		return ans;
	}

	public static void tryAgain(Scanner scan){
		clearScreen();
		String ans = getHeader(false);
		ans += ":: Your input is invalid, please select ::" + "\n";
		ans += ":: a valid option.                      ::" + "\n";
		ans += "===============================================================================" + "\n";
		System.out.println(ans);
		waitInput(scan);
	}

	public static void printScreenMessage(String message){
		String ans = getHeader(false) + "\n\n";
		ans += "::            " + message + "\n\n";
		System.out.println(ans);

	}


	public static void displayMenu(){
		//TODO: clear screen System.out.();
		String ans = getHeader(false);
		ans += "::                                                                           ::" + "\n";
		ans += ":: Help Menu                                                                 ::" + "\n";
		ans += "::                                                                           ::" + "\n";
		ans += "===============================================================================" + "\n";
		ans += ":: Options:                                                                  ::" + "\n";
		ans += ":: Manager Options                                                           ::" + "\n";
		ans += ":: 1. Load staff members                                                     ::" + "\n";
		ans += ":: 2. Print Staff Members                                                    ::" + "\n";
		ans += ":: Sorting Options                                                           ::" + "\n";
		ans += ":: 3. Sort staff by   (name)                                                 ::" + "\n";
		ans += ":: 4. Sort staff by   (age)                                                  ::" + "\n";
		ans += ":: Searching Options                                                         ::" + "\n";
		ans += ":: 5. Search staff by (name)                                                 ::" + "\n";
		ans += ":: 6. Search staff by (age)                                                  ::" + "\n";
		ans += ":: Other options                                                             ::" + "\n";
		ans += ":: 7. Help                                                                   ::" + "\n";
		ans += ":: 0. Exit                                                                   ::" + "\n";
		ans += "===============================================================================" + "\n";
		System.out.println(ans);

	}

	public static void displayHelpMenu(){
		//TODO: clear screen System.out.();
		String ans = getHeader(false);
		ans += ":: Options:                                                                  ::" + "\n";
		ans += ":: Manager Options                                                           ::" + "\n";
		ans += ":: 1. Load staff members: load staff member into the system. MUST be run (1) ::" + "\n";
		ans += ":: 2. Print Staff Members: display staff info on screen                      ::" + "\n";
		ans += ":: Sorting Options : after perform sorting, use Function (2)                 ::" + "\n";
		ans += ":: 3. Sort staff by   (name): Sort staff members by their name.              ::" + "\n";
		ans += ":: 4. Sort staff by   (age): Sort staff member by their age                  ::" + "\n";
		ans += ":: Searching Options                                                         ::" + "\n";
		ans += ":: 5. Search staff by (name):                                                ::" + "\n";
		ans += ":: 6. Search staff by (age)                                                  ::" + "\n";
		ans += ":: Function (5,6): perform a search in your staff database. If staff found,  ::" + "\n";
		ans += ":: then staff member's info is displayed on screen. Otherwise, error message ::" + "\n";
		ans += ":: Other options                                                             ::" + "\n";
		ans += ":: 0. Exit: exit software.                                                   ::" + "\n";
		ans += "===============================================================================" + "\n";
		System.out.println(ans);

	}

	public static void exitMessage(){
		clearScreen();
		printScreenMessage("Thank you!!");
	}

	public static String getQuery(Scanner scan){
		System.out.println("\n" + ":: Search query: ");
		String ans = scan.nextLine();
		System.out.println("\n\n");
		return ans;

	}

	public static int getInput(Scanner inputScan, int [] optionsAvailable){
		String ans = ":: Your option: ";
		System.out.println(ans);
		String _input = inputScan.nextLine();
		int _option = Integer.parseInt(_input);
		for(int i = 0; i < optionsAvailable.length; i++)
			if(_option == optionsAvailable[i])
				return _option;	
		
		return -1;
	}

	public static boolean performAction(Company cltda, int _option, Scanner inputScan){
		String query = "";
		switch(_option){
			case 1: 
				clearScreen();
				getHeader(true);
				cltda.loadStaff("./staff.txt");
				waitInput(inputScan);
				break;
			case 2:
				clearScreen();
				getHeader(true);
				cltda.displayStaff();
				waitInput(inputScan);
				break;
			case 3:
				clearScreen();
				cltda.sortStaffByName();
				printScreenMessage("Staff sorted by (name)");
				cltda.displayStaff();
				waitInput(inputScan);
				break;
			case 4:
				clearScreen();
				cltda.sortStaffByAge();
				printScreenMessage("Staff sorted by (age)");
				cltda.displayStaff();
				waitInput(inputScan);
				break;
			case 5:
				clearScreen();
				printScreenMessage("Searching by (name)");
				query = getQuery(inputScan);
				cltda.searchStaffByName(query);
				waitInput(inputScan);
				break;
			case 6:
				clearScreen();
				printScreenMessage("Searching by (age)");
				query = getQuery(inputScan);
				cltda.searchStaffByAge(Integer.parseInt(query));
				waitInput(inputScan);
				break;
			case 7:
				clearScreen();
				displayHelpMenu();
				waitInput(inputScan);
				break;
			case 0:
				exitMessage();
				waitInput(inputScan);
				return false;
		}
		return true;

	}


	public static void main(String [] args){

		Scanner inputScan = new Scanner(System.in);
		int [] options = new int []{1,2,3,4,5,6,7,0};
		Company hungryDonalds = new Company();

		//myCompany.loadStaff("./staff.txt");
		//myCompany.displayStaff();


		//myCompany.sortStaffByAge();
		//myCompany.searchStaffByAge(14);
		//myCompany.sortStaffByName();
		//myCompany.displayStaff();
		//myCompany.searchStaffByName("JustinBieber");
		//myCompany.displayStaff();


		boolean _continue = true;
		while(_continue){
			clearScreen();
			displayMenu();
			int _option = getInput(inputScan, options);
			if(_option != -1)
				_continue = performAction(hungryDonalds, _option, inputScan);
			else
				tryAgain(inputScan);
		}
	}
}