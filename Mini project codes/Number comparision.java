/**
 * This Code check which number is grater  
 * @author RajPatel
 */

//import necessary pakages
import java.util.*;


public class Problem3{


	//CompareNumber is a method that return nothing so it uses void and it takes 2 int as parameters 
	public static void compareNumbers(float a , float b){
		//compare both the parameter variable a and b 
		if(a>b){
				System.out.format("The bigger number is %.3f %n" , a);
			}
		else if (a < b) {
				System.out.format("The bigger number is %.3f %n" , b);
			}
		else{
				System.out.format("Both are the same number %n");
			}

	}//end of compareNumbers method

	public static void main(String[] args) {
		
		//creating object of Scanner to take input 
		Scanner input = new Scanner(System.in);

		try{

			System.out.format("Please, Insert a number (1): ");
			float user_num1 = input.nextFloat();
			System.out.format("%n");
			
			
			System.out.format("Please, Insert a number (2): ");
			float user_num2 = input.nextFloat();
			System.out.format("%n");

			//calls the method compareNumbers and pass 2 arguments number 1 and 2
			compareNumbers(user_num1 , user_num2);
			
			
			
		}//end of try

		catch(Exception e){

			System.out.println("Please enter a valid Number");

		}//end of catch block 	

	}//end of main

}// end of Problem3