//==================================
// Foundations of Computer Science
// Student: Raj Patel   
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

class QuickSort extends MySortAlg {

	public int[] sort(int[] array) {
		// Calling recursive sort for the whole array
		this.sortRec(array, 0, array.length-1);
        int[] reverseArray = reverse_array(array);
        return reverseArray;
	}

    private void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

	// Sort an array recursively
    private int[] sortRec(int[] array, int start, int end) {
        if (start < end) {
			// Reorder an array to [< pivot, pivot, >= pivot] and return an index of pivot position
            int pivot_idx = partition(array, start, end);

            // Call sort recursively for left and right parts
            this.sortRec(array, start, pivot_idx-1);
            this.sortRec(array, pivot_idx+1, end);
        }
        return array;
    }

	// Reorder an array to [< pivot, pivot, > pivot] and return an index of pivot position
    private int partition(int[] array, int start, int end) {
    	// Choose last element as pivot
        int pivot = array[end];

        // Swap all element that are < pivot to the left part
        int i = start; // index of current "free" space in the left part
        for (int j = start; j < end; j++) {
            // If current element is smaller than the pivot
            if (array[j] < pivot) {
                // Put this element in the left part
                this.swap(array, i, j);

                // Position i is already occupied with smaller element -> increment
                i++;
            }
        }

		// Put pivot at its place (after the smaller part)
        this.swap(array, i, end);

        return i;
    }



}