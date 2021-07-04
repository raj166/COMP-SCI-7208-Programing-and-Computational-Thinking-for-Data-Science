/**
 * This Code calculates the determinant of a 2X2 and 3X3 matrix
 * @author RajPatel
 */

//import necessary pakages
import java.util.*;


public class matrix{

		// final value variable
		int determinant_value;

		//methods to calculate the determinant parameters is a 2d array
		void Determinant(int[][] a){

			//if length of arrray is 3X3
			if(a.length == 3) {
				//using the first column as main and calculate the determinant 
				int value_1 = a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]);
				int value_2 = a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]);
				int value_3 = a[0][2]*(a[1][0]*a[2][1] - a[1][1]*a[2][0]);
				
				this.determinant_value = value_1 - value_2 + value_3;
					
			}//end of if loop
			else{
				//if the length of array is 2X2

				int value_1 = a[0][0]*a[1][1];
				int value_2 = a[0][1]*a[1][0];

				this.determinant_value = value_1-value_2;

			}//end of else loop
			
		}//end of Determinant method


		//method to print the matrix
		void Print_determinant(int[][] a){
			System.out.format("%n%n%n%n");
			for (int i = 0; i < a.length; i++){
				
				System.out.print("| ");
				
				for (int j = 0; j < a[i].length; j++){
					
					System.out.print(a[i][j] + " ");
                	
            	}//end of for loop j

            	System.out.print("| ");
            	System.out.format("%n");
        	
        	}//end of for loop i

        	System.out.format("The determinant of above matrix is : %d %n %n %n", determinant_value);
		
		}//end of method Print_determinant


	public  static void main(String[] args){
		boolean loop_entry = true;
		Scanner input = new Scanner(System.in);

		try{

			//declaring 2X2 array and 3X3 array 
			int[][] twoD_arr = new int[2][2];
			int[][] threeD_arr = new int[3][3];

			System.out.format("Welcome to Matrix Determinant Calculator!"); 

			do{
				System.out.format("%nWould you like to calculate the determinant of a new matrix? %n1. Yes, 2. No  ");

				int user_input  = input.nextInt();

				//switch case depending on the user_input variable
				switch(user_input){
					case 1:
						try{

							System.out.format("What is the dimension of the matrix? %n 1)2x2 2)3X3  ");

							int matrix_size  = input.nextInt();

							System.out.format("Great! Let's calculate this determinant then.%n");
							System.out.println("Please insert all the values for your matrix.");

							
							if(matrix_size == 1){	
								//case of 2X2 matrix
								for (int i = 0; i < 2; i++){
									for (int j = 0; j < 2; j++){
										
										System.out.format("Enter value for matrix[%d][%d]: ", i+1,j+1 );
										twoD_arr[i][j]= input.nextInt();
		            					}
		            				}

								//creating object d1 of matrix
								matrix d1 = new matrix();
								
								//calculating the determinant by calling method using d1
								d1.Determinant(twoD_arr);
								
								//printing the determinant and matrix by calling method using d1
								d1.Print_determinant(twoD_arr);

							}//end of if

							else if (matrix_size == 2){
								//case for 3X3 matrix
								for (int i = 0; i < 3; i++){
									for (int j = 0; j < 3; j++){
										
										System.out.format("Enter value for matrix[%d][%d]: ", i+1,j+1 );
										threeD_arr[i][j]= input.nextInt();
									}
								}

		        				//creating object d2 of matrix
		        				matrix d2 = new matrix();

		        				//calculating the determinant by calling method using d2
								d2.Determinant(threeD_arr);

								//printing the determinant and matrix by calling method using d2
								d2.Print_determinant(threeD_arr);
								
							}//end of elseif
							break;
						}// end of try block

						catch(Exception e){

							System.out.println("Please Enter a valid number");
						}//end of catch block 

					case 2:

						loop_entry = false;
						break;

					default:

						// if the user enter wrong input then show this msg 
						System.out.format("You have entered invalid choice please select a valid choice. %n");
				}//Switch case 
			}while(loop_entry);
		}//end of try block
		catch(Exception e){
			System.out.println("you have entered a invalid choice: ");
		}
	}//main
}//matrix