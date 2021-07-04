/**
 * This Code calculate sum/sub/mul/div of complex number
 * @author RajPatel
 */

//import necessary pakages
import java.util.*;


public class ComplexCalculator{
	
	double real, img;
		
	//parameterized constructor 	
	ComplexCalculator(double r, double i){
		this.real = r;
		this.img = i;
	}
	//creating a temporary complex number to hold the return value
	// static is used so that we can access it anywehere in the static methods without creating a obj
	static ComplexCalculator temp = new ComplexCalculator(0,0);

	//sum 
	public static ComplexCalculator sum(ComplexCalculator c1, ComplexCalculator c2){
	
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        //returning the output complex number
        return temp;
    }

    //Sub
    public static ComplexCalculator Sub(ComplexCalculator c1, ComplexCalculator c2){

        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        
        //returning the output complex number
        return temp;
    }

    //mul
    public static ComplexCalculator mul(ComplexCalculator c1, ComplexCalculator c2){
	
        temp.real = c1.real*c2.real + c1.img*c2.img;
        temp.img = c1.img*c2.real + c2.img*c1.real;
        
        //returning the output complex number
        return temp;
    }

    //div
    public static ComplexCalculator div(ComplexCalculator c1, ComplexCalculator c2){
	
        temp.real = (c1.real*c2.real + c1.img*c2.img)/(Math.pow(c2.real, 2) + Math.pow(c2.img, 2));
        temp.img = (c1.img*c2.real - c2.img*c1.real)/(Math.pow(c2.real, 2) + Math.pow(c2.img, 2));
        	
        
        //returning the output complex number
        return temp;
    }




	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.format("Welcome dear user! %n");
		
		//loop_entry variable will decide entry in while loop
		// initialy true to enter the while loop
		boolean loop_entry = true;
		//creating the temp Complex variable
		ComplexCalculator temp;

		try{
		//values for complex number 1
			System.out.format("%n Enter the real value of complex number (1): ");
			double c1_real =  input.nextDouble();
			System.out.format("%n Enter the img value of complex number (1): ");
			double c1_img = input.nextDouble();
			

			//values for complex number 2 
			System.out.format("%n Enter the real value of complex number (2): ");
			double c2_real =  input.nextDouble();
			System.out.format("%n Enter the img value of complex number (2): ");
			double c2_img =  input.nextDouble();



			//creating objt c1 and c2 for using the paramterized constructer and setting the value for real and img part  
			ComplexCalculator c1 = new ComplexCalculator(c1_real , c1_img);
			ComplexCalculator c2 = new ComplexCalculator(c2_real, c2_img);

			do{	
			//options
			System.out.format("%nWould you like to:%n");
			System.out.format("(a) Addition of the two complex numbers (add) %n(b) Subtraction of the two complex numbers (sub) %n");
			System.out.format("(c) Multiplication of the two complex numbers (multiplication) %n(d) Division of the two complex numbers. (division)%n(e) Exit %n");
			
			//taking input from user a/A or b/B
			char user_input  = input.next().charAt(0);

			//switch case depending on the user_input variable
			switch(user_input){
				case 'a': case 'A':

						//Sum 
						temp = sum(c1, c2);

						if (temp.img>=0){System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");}
						else{System.out.printf("Sum is: "+ temp.real+" "+ temp.img +"i");}					
						break;


				case 'b': case 'B':

						//Sub
						temp = Sub(c1, c2);
						if (temp.img>=0){System.out.printf("Subtraction is: "+ temp.real+" + "+ temp.img +"i");}
						else{System.out.printf("Subtraction is: "+ temp.real+" "+ temp.img +"i");}					
						break;


				case 'c': case 'C':

						//multiplication
						temp = mul(c1, c2);
						if (temp.img>=0){System.out.printf("Multiplication is: "+ temp.real+" + "+ temp.img +"i");}
						else{System.out.printf("Multiplication is: "+ temp.real+" "+ temp.img +"i");}					
						break;
						


				case 'd': case 'D':

						//Division
						temp = div(c1, c2);
						if (temp.img>=0){System.out.printf("Division is: "+ temp.real+" + "+ temp.img +"i");}
						else{System.out.printf("Division is: "+ temp.real+" "+ temp.img +"i");}						
						break;


				case 'e': case 'E':
						
						loop_entry = false;
						break;

				default:
					// if the user enter wrong input then show this msg 
					System.out.format("You have entered invalid choice please select a valid choice. %n %n");

			}//end of switch case block

		System.out.format("%n");
		
		}while(loop_entry);//end of do while loop

		}//end of try block
		catch(Exception e){
			System.out.println("You enter a invalid symbol:");
		}

		

		

	}//main

}//ComplexCalculator