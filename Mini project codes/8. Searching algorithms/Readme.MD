# Search Algorithms
  Question 1: You need to build a base class for all your searching algorithms. 
  You should name this base class as MySearchAlg. Since we cannot implement the 
  search method in base class, you should declare it as an abstract class. 
  Or you can add some dummy implementation if you want to create it as a static method. 
  You can choose whatever is more suitable for your implementation, 
  but be ready to justify your choice.

   public abstract class MySearchAlg
  
    Methods:
    abstract int search(int[] array, int num);
        

  Question 2: Define a LinearSearch class. This class should extend the MySearchAlg class. 
  In this class, your search method should take a sequence of integer numbers and the 
  number you want to find as input and return the index of that number. The index starts 
  from 0, return -1 when it does not exist.
  
    public class LinearSearch
      Methods:
      public int search(int[] array, int num);
      
  Question 3: Define a BinarySearch class. This class should extend the MySearchAlg class. 
  In this class, your search method should take a sequence of integer numbers and the number 
  you want to find as input and return the index of that number. 
  The index starts from 0, return -1 when it does not exist.

    public class BinarySearch
      Methods:
      public int search(int[] array, int num);
    
  Question 4: In your Main class,  build a test method to test your code.
  
      private static boolean test(int result, int ans);
       
        The test method should take two integers as input, the 
        result is an integer returned by one of your searching 
        algorithms, and the ans is an integer generated by 
        yourself. Your test method should compare if these two 
        integers are the same, return true when they are the 
        same and false when they not. You should generate at 
        least 3 test cases and use these test cases to test 
        all searching algorithms above.
        
   Question 5: In your Main class, build a findMaxVal method.

      Input:  array = {1,5,8,12,9,7,-1}
      Output: 3

      Input:  array = {1,15,0}
      Output: 1

  
