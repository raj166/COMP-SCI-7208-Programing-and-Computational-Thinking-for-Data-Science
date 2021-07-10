# Data Structure
  Question 1: Define a Node class to represent the elements in a Stack or Queue. 
  The Node class should have a data field and a next field that would reference another Node. 
  In the constructor, next should be initialised as NULL.

   public class Node 
  
    Attributes:
    private String data; // the data saved in this node
    private Node next; // the reference to another node

    Methods:
    // Print the data saved in the node. 
    public void printNode();

    // You should also implement the constructors, mutators and accessors.
    ...

    Example output for printNode():
    Node data: "data saved in this node"
        

  Question 2: Define a MyStack class. The Stack is a 'first in, last out' data structure. 
  You need to implement a stack by using the Node class you implemented in Question 1. 
  You need to implement a push() method for entering elements, a pop() method for 
  retrieving elements from a stack and an isEmpty() method returning true if nothing is
  on the top of the stack.
  
    public class MyStack 
      Attributes:
      private Node top; // The reference to the top node in this stack

      Methods:
      // You should initialise an empty stack in the constructor.
      public MyStack(); 

      // Push a node into stack
      public void push(Node node); 

      // Get and remove the top node from this stack.
      // Return Null and print "Stack is empty" when the stack is empty.
      public Node pop(); 

      // Get the top node in this stack. 
      // Return Null and print "Stack is empty" when the stack is empty.
      public Node peek(); 

      // Return TRUE when the stack is empty, otherwise, return FALSE.
      public boolean isEmpty(); 
      
 Question 3: In your Main class, build a bracketsMatching() method.
 The bracketsMatching method takes a String of lower case letters as input. 
 Your bracketsMatching method should return TRUE when the brackets/parenthesis 
 are matching, and return FALSE if not. For example,
 
    Input:  ({})
    Output: true

    Input:  ({)
    Output: false

    Input:  (1+2) * {(2+3)*(3+4)}
    Output: true

    Input:(1+2) * {{2+3)*(3+4}}
    Output: false
    
  Question 4: Define a MyQueue class. Queue is a 'first in, first out' data structure. 
  You need to implement a queue by the Node class you implemented in Question 1. 
  You need to implement a queue by creating enqueue() method for entering elements and dequeue() 
  method for retrieving elements from a queue. The data type stored in your queue should be String.
  
  
      public class MyQueue 
        Attributes:
        private Node front, rear; // The reference to the first and last node in this queue

        Methods:
        // You should initialise the an empty queue in the constructor.
        public MyQueue(); 

        // Insert one node at the end of the queue.
        public void enqueue(Node node);

        // Get and remove the front node from the queue. 
        // Return Null and print "Queue is empty" when the queue is empty
        public String dequeue(); 

        // Return TRUE when the queue is empty, otherwise, return FALSE.
        public boolean isEmpty(); 

        // Print out the data saved in nodes from the first to the last. 
        // Return and print "Queue is empty" when the queue is empty
        // You should call printNode() to print each node in this method.
        public void displayQueue(); 
        
  Question 5: In your Main class, build a reverseQueue method. public static MyQueue reverseQueue(MyQueue queue);
  The reverseQueue method takes a Myqueue object as input,  and return a Myqueue object which saves a reversed queue. 
  You need to use enqueue, dequeue to solve this problem.
  
      Input:  1 4 7 9 2
      Output: 2 9 7 4 1

      Input:  3 3 4 1 2
      Output: 2 1 4 3 3

  
  
