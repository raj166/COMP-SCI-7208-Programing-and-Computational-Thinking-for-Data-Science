//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

public abstract class MySortAlg{
	
	//abstract sort method inmplementation in extended class 
	abstract int[] sort(int[] array);
	
	//printing the array
	public void print(int[] array) {
        System.out.print("[ ");
        for (int i = array.length -1; i>=0 ;i--) {
        	if(i==0){
        		System.out.print(array[i]);
        	}
        	else{
        		System.out.print(array[i]+ ", ");
        	}
        }
        System.out.println(" ]");
    }//print method

    public int[] reverse_array(int[] array){
        int n = array.length;
        int[] reversed_array = new int[n];
        int j;
        for (int i =0; i<n ;i++){
            j = n-i-1;
            reversed_array[j] = array[i];   
         } 
        return reversed_array;
    }

}//MySortAlg