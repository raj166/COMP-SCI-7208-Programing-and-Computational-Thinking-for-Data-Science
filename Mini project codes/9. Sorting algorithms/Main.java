//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

import java.util.Arrays;

public class Main{

	public static boolean test(int[] result, int[] ans){
		boolean retval = Arrays.equals(result, ans);
		return retval;
	}

	public static boolean compare(int[] arr1, int[] arr2){
		MergeSort sortAlg = new MergeSort();
		return test(sortAlg.sort(arr1),sortAlg.sort(arr2));
	}

	public static int findSmallestSum(int[] array){
		MergeSort sortAlg = new MergeSort();
		array = sortAlg.sort(array);
		int length = array.length;
		int smallestSum = array[length-1] + array[length-2];
		return smallestSum;
	}

	public static void main(String[] args) {
		
		System.out.println("Merge Sort");
		MergeSort sortAlg = new MergeSort();
		int[] array = {0, 1, 2, 3, 4, 2};
		int[] expected_array = {4,3,2,2,1,0};
		System.out.println(test(sortAlg.sort(array), expected_array));

		System.out.println("Quick Sort");
		QuickSort sortAlg1 = new QuickSort();
		int[] array1 = {12,10,8,15,17,20};
		int[] expected_array1 = {20,17,15,12,10,8};
		System.out.println(test(sortAlg1.sort(array1), expected_array1));

		System.out.println("Insertion Sort");
		InsertionSort sortAlg2 = new InsertionSort();
		int[] array2 = {30,32,23,44,56,78};
		int[] expected_array2 = {78,56,44,32,30,23};
		System.out.println(test(sortAlg2.sort(array2), expected_array2));



		System.out.println("Comparing the arrays example 1");
		int[] arr1 = {2,4,1,3,5};
        int[] arr2 = {1,3,2,4,5};
		System.out.println(compare(arr1 , arr2));

		System.out.println("Comparing the arrays example 2");
		int[] arr3 = {4,1,3,5};
        int[] arr4 = {1,3,2,4,5};
		System.out.println(compare(arr3 , arr4));


		System.out.println("Finding the smallest sum of two digits from array Example 1");
		int[] array12 = {0,3,5,6,7,8,9,10};
		System.out.println(findSmallestSum(array12));

		System.out.println("Finding the smallest sum of two digits from array Example 2");
		int[] array13 = {1,1,5,6,7,8,9,10};
		System.out.println(findSmallestSum(array13));

		
	}
}