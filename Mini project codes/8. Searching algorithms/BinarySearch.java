//==================================
// Foundations of Computer Science
// Student: Raj Patel   
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================
public class BinarySearch extends MySearchAlg{
	
    //implementing the  abstract Search Method 
    public int search(int[] array, int num){
		return binarySearch(array , num , 0 , array.length-1);
	}


    //binarySearch
	public int binarySearch(int[] arr, int item , int lower , int upper){
		if (upper >= lower) {
            int mid = lower + (upper - lower) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == item)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > item)
                return binarySearch(arr, item,lower, mid - 1);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, item, mid + 1, upper);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
	}
}