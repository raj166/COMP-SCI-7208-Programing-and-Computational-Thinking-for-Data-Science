# Build Your Own Sorting Algorithms
  
  Question 1: You need to build a base class for all your sorting algorithms. 
  You should name this base class as MySortAlg. Since we can not implement the 
  sort method in base class, you should declare it as an abstract class 
  (Links to an external site.). Or you can add some dummy implementation if you 
  want to create it as a static method. You can choose whatever is more suitable 
  for your implementation, but be ready to justify your choice. 

    public abstract class MySortAlg
  
      Methods:
      abstract int[] sort(int[] array);
        
  Question 2: Define an InsertionSort class. This class should extend the MySortAlg class. 
  In this class, your sort() method should take a sequence of integer numbers as input and 
  return a sorted array in descending order.
  
    public class InsertionSort
    
      Methods:
      public int[] sort(int[] array);  
      
  Question 3: Define a MergeSort class. This class should extend the MySortAlg class. In this 
  class, your sort() method should take a sequence of integer numbers as input and return a 
  sorted array in descending order. You can add other methods to help you to implement 
  merge sort algorithms. Please note that for all other methods you create in this class, you 
  can design the signature by yourself. But these methods should be declared as private. 
     
    public class MergeSort
     
     Methods:
     public int[] sort(int[] array);
    
  Question 4: Define a QuickSort class. This class should extend the MySortAlg class. In this 
  class, your sort() method should take a sequence of integer numbers as input and return a 
  sorted array in descending order. You can add other methods to help you to implement merge sort
  algorithms. Please note that for all other methods you create in this class should be declared 
  as private. 
  
     public class QuickSort
     
     Methods:
       public int[] sort(int[] array);
        
 Question 5: In your Main class,  build a test method to test your code.
  
    public static boolean test(int[] result, int[] ans);
    
 Question 6: Hint: the sorting algorithm you just built will help you to
 solve this question. In your Main class, build a compare method. 
    
    public static boolean compare(int[] arr1, int[] arr2);
    
    This method take two arrays as input and return true when they are 
    eual and return false otherwise. Two arrays are said to be equal if
    both of them contain same set of elements, order of elements may be
    different though. You can assume that in one array, one element will
    only appear one time. For example, 
    
    Input:  arr1[] = {2,4,1,3,5}
            arr2[] = {2,4,1,3,5}
    Output: True
    
    Input:  arr1[] = {1,3,5,2,4}
        arr2[] = {2,4,1,3,5}
    Output: True
    
 Question 7: Hint: the sorting algorithm you just built will help you to solve this 
 question. In your Main class, build a findSmallestSum method. 

    public static int findSmallestSum(int[] array);
    
    Input:  array = {4,7,0,0,2,9,10}
    Output: 0
    
    


      
