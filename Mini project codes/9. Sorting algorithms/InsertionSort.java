//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

public class InsertionSort extends MySortAlg{
	
    //calling the sort method
	public int[] sort(int[] array){
        array = Insertion_sort(array);
        int[] reverseArray = reverse_array(array);
        return reverseArray;  
	}//sort
    

    private int[] Insertion_sort(int[] array){
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
        return array;
    }

}//InsertionSort