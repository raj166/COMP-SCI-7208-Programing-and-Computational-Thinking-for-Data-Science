//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

//Linear Search class
public class LinearSearch extends MySearchAlg{

	//implementing the abstract method for class Search
	public int search(int[] array, int num){

		//dafualt return value is -1 if element is not found
		int returnVal = -1;

		//checking each element in the array
		for (int i =0; i < array.length  ;i++){

			//if elemt presetn in the array enter the if loop
			if(array[i] == num){

				returnVal = i;
				break;
			}

		}//for loop
		return returnVal;
	}
}