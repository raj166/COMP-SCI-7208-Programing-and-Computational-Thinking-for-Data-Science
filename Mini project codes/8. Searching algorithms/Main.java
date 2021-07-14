//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================
public class Main{

	private static boolean test(int result, int ans){

		//default value 
		boolean i = true;
		if(result == ans){
			i = true;
		}
		else{
			i= false;
		}
		return i  ;
	}

	private static int findMaxVal(int array[]){

		int n = array.length;

        //starting from index 1 and comparing all the elements on the left
        for (int i = 1; i < n; ++i){

            int key = array[i];
            int j = i - 1;

            //comparing the elemts on the left till bigger element is found and then its being replaced
            while (j >= 0 && array[j] > key) {

                array[j + 1] = array[j];
                j = j - 1;

            }//while

            array[j + 1] = key;

        }//for
        return array[array.length-1];
	}

	public static void main(String[] args) {
		
		int num = 223;
		int[] array = {1,2,3,5,23,6,9,8,7, -1};

		
		//Binary Search Algo  
		BinarySearch obj = new BinarySearch();
		int[] sorted_array = {1,2,3,5,16,19,23,56};
		int index = obj.search(sorted_array, num);
		System.out.println(test(index , -1));
		
		//Linear Search Algo
        LinearSearch obj1 = new LinearSearch();
        index = obj1.search(array, num);
        System.out.println(test(index , 3));

        num = 23;
        index = obj1.search(array, num);
        System.out.println(test(index , 4));

        System.out.println(findMaxVal(array));
	}
}