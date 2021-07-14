//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

class MergeSort extends MySortAlg {

	public int[] sort(int[] array) {
		// Calling recursive sort for the whole array
		array = sortRec(array, 0, array.length-1);
		int[] reverseArray = reverse_array(array);
        return reverseArray;
	}

	// Sort an array recursively
    private int[] sortRec(int[] array, int start, int end) {

    	//condition to Check weather the length of array is grater than 1 or not
    	if (start < end) {

            //Finding the middle point of array
            int middle = (start + end) / 2;

            // Call sort recursively for left part
            sortRec(array, start, middle);
            // Call sort recursively for right part
            sortRec(array, middle+1, end);

            // Merge two sorted parts
            array = merge(array, start, middle, end);
        }
        return array;
    }

	// Merge two sorted subarrays
    private int[] merge(int array[], int start, int middle, int end) {
        // Lengths of subarrays
        int n1 = middle - start + 1; // left part
        int n2 = end - middle; // right part

        // Copy two parts into tmp arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = array[start + i];
        for (int i = 0; i < n2; i++)
            right[i] = array[middle + 1 + i];

        // Merge elements
        int i1 = 0, i2 = 0, j = start;

		// While both arrays still have elements to compare
        while (i1 < n1 && i2 < n2) {
            if (left[i1] < right[i2]) {
                array[j] = left[i1];
                i1++;
            } else {
                array[j] = right[i2];
                i2++;
            }
            j++;
        }

        // Add all elements that left in any array
		while (i1 < n1) {
			array[j] = left[i1];
			j++;
			i1++;
		}

		while (i2 < n2) {
			array[j] = right[i2];
			j++;
			i2++;
		}

		return array;
    }
}