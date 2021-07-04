//import necessary pakages
import java.util.*;

/**
 * This code will calculate the denomination for a certain amount.
 * @author RajPatel
 */

public class main{

	public void run(int user_amt){
		// creating the denomination we have 
		int  note_$20 = 0 , note_$50 =0;
		
		while(user_amt >=20){
			while (user_amt >= 50) {

				// this will calculate the number of notes of $50 we need
				note_$50 =  user_amt/50 + note_$50;

				// this will give us the amount left after deducting _ number of $50 notes
				user_amt = user_amt % 50;
			
			}//end of $50 while loop

			while(user_amt>=20){

				// this will calculate the number of notes of $20 we need
				note_$20 = user_amt/20 + note_$20;

				// this will give us the amount left after deducting _ number of $20 notes
				user_amt = user_amt%20;
			
			}//end of $20 while loop
		}

		 if(user_amt == 0){

		 	// if we can provide the amount the user asked then we will print this msg 
		 	System.out.format("Here is %d $20 notes and %d $50 notes. %n" , note_$20 , note_$50);
		 
		 }
		 else{

		 	// if we cant provide the amount the user entered print this msg 
		 	System.out.println("Sorry, the value you input cannot be withdrew");
		 
		 }//end of if-else loop
    
  	}// end of method run

	public static void main(String[] args) {
		int user_amt;
		Scanner input = new Scanner(System.in);
		System.out.format("Enter the amount you need: ");
		user_amt = input.nextInt();
		//run(user_amt);
		main obj = new main();
	    // calling method
	    obj.run(user_amt);


	}// end of main method 

}//end of main class
