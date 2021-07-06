/**
 * This class uses classes from class BaseOperations
 * @author RajPatel
 */
public class Array operations {
	public static void main(String[] args) {

		//creating object of BaseOperations and calling its method later 
		BaseOperations obj = new BaseOperations();
		
		//creating  array with int elements
		int[] array_int ={1,2,3,4,5,6,7,8,9};
		System.out.format("Printing Int array%n");
		obj.printArray(array_int); // printing the array using the printArray method
		

		System.out.format("%n--------%n");
		

		//reversing the array and storing the return value of reverseArray in reverseArrayInt	
		int[] reverseIntArray;
		reverseIntArray = obj.reverseArray(array_int);
		System.out.format("Printing reverse of Int array%n");
		obj.printArray(reverseIntArray);


		System.out.format("%n--------%n");


		//creating array having string elements and peinting the elements 
		String[] array_string = {"Hi" , "This" , "Is" , "Raj", "I" , "am", "a" , "Data Scientist"};
		System.out.format("Printing String array%n");
		obj.printArray(array_string);
		

		System.out.format("%n--------%n");
		

		//reversing the array and storing the return value of reverseArray in reverseArrayString
		String[] reverseStringArray; 
		reverseStringArray = obj.reverseArray(array_string);
		System.out.format("Printing reverse of string array%n");
		obj.printArray(reverseStringArray);

		
		System.out.format("%n--------%n");


		//creating array having float elements and peinting the elements 
		float[] array_float = {1.3f , 1.4f , 1.3f, 1.3f , 15.7f, 124.5f, 45.6f};
		System.out.format("Printing float array%n");
		obj.printArray(array_float);
		

		System.out.format("%n--------%n");
		

		//reversing the array and storing the return value of reverseArray in reverseArrayFloat
		float[] reverseFloatArray;
		reverseFloatArray = obj.reverseArray(array_float);
		System.out.format("Printing reverse of float array%n");
		obj.printArray(reverseFloatArray);

		System.out.format("%n--------%n");

	}// end of main method
}
