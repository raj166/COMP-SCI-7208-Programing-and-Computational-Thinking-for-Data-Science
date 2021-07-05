//import necessary pakages
import java.util.*;


public class Problem{

	public static void main(String[] args){

		//creating object of Scanner to take input 
		Scanner input = new Scanner(System.in);

		//Display msg for miles input
		System.out.print("Enter a distance in miles: ");
		
		//taking input in int
		int distance_miles = input.nextInt();

		//Enters the if loop if the distance is in the range (0,1000)
		if(distance_miles>=0 && distance_miles <=1000) {

			//converting in KM
			float distance_kms = (float) 1.6093*distance_miles;

			//Printing the output
			System.out.format("The distance in kilometres is %.2f km %n" , distance_kms);
			
		}// end of if loop
		else{
			//to show that you have enter a number not in range of (0,1000)
			System.out.format("The distance %d is out of range" , distance_miles);

		}//end of else loop
		
	}// end of main method

}//end of Problem class