/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a1809073
*   student (name): Raj patel
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length);
		
		int n = index.length;
		for(int i = 0; i < n ; i++){
			int min_idx = i;
			for(int j = i+1; j<n; j++){
				if(arr[j] < arr[min_idx]){
					min_idx = j;
				}
			}
			int temp = arr[min_idx];
			int temp2 = index[min_idx];
			arr[min_idx] = arr[i];
			index[min_idx] = index[i];
			arr[i] = temp;
			index[i] = temp2;
		}
		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}


	@Override
	public int [] sortStringByIndex(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public String [] sortString(String [] arr){
		throw new java.lang.UnsupportedOperationException("Not implemented yet!");
	}
}
