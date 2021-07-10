public class MyStack extends Node{

	// The reference to the top node in this stack
	private Node top;

    //constructors
	MyStack(){
		super();
		this.top = null;
	}

	MyStack(String value){
		super(value);	
	}

	// insert at the beginning
    public void push(Node x){
 
        // set the .next pointer of the new node to point to the current
        // top node of the list
        x.setNext(this.top);
 
        // update top pointer
        this.top = x;
    }

    //removes element
	public Node pop(){
        
        // check for stack underflow
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        // update the top pointer to point to the next node
        Node temp = this.top;
		this.top = top.getNext();
		return temp; 
    }
 

	
	// Get the top node in this stack. 
	// Return Null and print "Stack is empty" when the stack is empty.
	public Node peek(){
        
        // check for empty stack
        if (!isEmpty()) {
            return this.top;
        }
        else {
            System.out.println("Stack is empty");
			return null;
        }
    }

	
	// Return TRUE when the stack is empty, otherwise, return FALSE.
	public boolean isEmpty(){
		return (this.top == null);
	}

	public void display(){
        // check for stack underflow
        if (this.top == null) {
            System.out.println("Stack Underflow");
        }
        else {
            Node temp1 = this.top;
            while (temp1 != null) {
 
                // print node data
                System.out.println(temp1.getData());
 
                // assign temp link to temp
                temp1 = temp1.getNext();
            }
        }

    }

}