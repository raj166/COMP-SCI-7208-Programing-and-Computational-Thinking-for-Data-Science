/**
 * This Code shows method concepts and method overloading
 * @author RajPatel
 * @ID a1809073
 */

public class BaseOperations{

	//Creating printArray methods to print int, string and float arrays

	//this will print arrays having int elemetns 
	public  void printArray(int[] a){

		//for loop to print the elements of the array 
		for(int element : a){
		
			System.out.println(element);
		
		}//end of for loop

	}//end of printArray with int elements 



	//this will print arrays having String elemetns 
	public  void printArray(String[] a){
		
		//for loop to print the elements of the array 
		for(String element : a){

			System.out.println(element);
		
		}//end of for loop

	}//end of printArray with String elements 



	//this will print array having float elements
	public  void printArray(float[] a){

		//for loop to print the elements of the array
		for(float element : a){

			System.out.println(element);
		
		}//end of for loop

	}//end of printArray with float elements 



	// creating methods to reverse the int,float, string array


	// this method will reverse the int array 
	public  int[] reverseArray(int[] a){
		
		//creating a new array having the same shape of input argument array a
		int[] array2 = new int[a.length];
		int j =0;

		//moving from last element to first and assigning the value to the new array while incrementing j's position
		for (int i = a.length -1 ;i>-1 ;i-- ){
			array2[j] = a[i];
			j++;

		}

		//return the reversed array 
		return array2;
	}// end of reverse the array with int elements



	// this method will reverse the float array 
	public  float[] reverseArray(float[] a){
		
		//creating a new array having the same shape of input argument array a
		float[] array2 = new float[a.length];
		int j =0;

		//moving from last element to first and assigning the value to the new array while incrementing j's position
		for (int i = a.length -1 ;i>-1 ;i-- ){
			array2[j] = a[i];
			j++;

		}

		//return the reversed array 
		return array2;
	}// end of reverse the array with float elements



	// this method will reverse the string array 
	public  String[] reverseArray(String[] a){
		
		//creating a new array having the same shape of input argument array a
		String[] array2 = new String[a.length];
		int j =0;

		//moving from last element to first and assigning the value to the new array while incrementing j's position
		for (int i = a.length -1 ;i>-1 ;i-- ){
			array2[j] = a[i];
			j++;

		}

		//return the reversed array 
		return array2;
	}// end of reverse the array with string elements

}// end of BaseOperation class
