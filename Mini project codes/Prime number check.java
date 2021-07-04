/**
 * This Code check if user entered a prime number or not 
 * @author RajPatel
 */

//import necessary pakages
import java.util.*;


public class Problem2{

	//flag to enter the last step of printing block
	static boolean flag = true;

	public static boolean primeCheck(int a){

		if(a>1){
			//i value will increase from 2 to the value of number and try to divide it 
			for (int i = 2; i<a ;i++ ){
				//if the num is divisible then we will enter if block and change the status of flag to false
				if(a % i == 0){
					flag = false;
					break;				
					//break is used bcase if for 1 time the value is divisible by i then it is not prime no need to cheack further					
					}//end of if block			
				}//end for for block		
			}// end of if a >1 if block

		else{
			
			flag = false;
			
			}
		//return the value of the flag
		return flag;
	}//end of primeCheck method


	public static void main(String[] args){	
		
		System.out.format("Please, Insert a number: ");
		
		try{
			
			//creating object of Scanner to take input 
			Scanner input = new Scanner(System.in);

			int num = input.nextInt();
			
			flag = primeCheck(num);

			//if else to print result according to the flag value 
			if(flag == true){
				System.out.println("Your number is prime");
			}
			else{
				System.out.println("Your number is not prime");
			}

			
		}//end of try

		catch(Exception e){

			System.out.println("Please enter a valid Number");

		}//end of catch block 	

	}//end of main

}// end of Problem02 class