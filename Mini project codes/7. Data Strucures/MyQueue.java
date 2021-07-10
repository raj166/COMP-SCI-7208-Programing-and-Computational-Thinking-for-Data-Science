public class MyQueue extends Node{
	
	//points to the last element of the queue
	private Node front, rear; 
	//total element in the queue
	private int size; 

	//constructor
	public MyQueue() {
		this.size = 0;
		this.rear = null;
		this.front = null;
	}

	public void setFront(Node temp){
		this.front = temp;
	}
	
	public void setRear(Node temp){
		this.rear = temp;
	}

	public Node getFront(){
		return this.front;
	}
	
	public Node getRear(){
		return this.rear;
	}


	//checks is the queue empty
	public boolean isEmpty(){
		boolean response = false;
		if(this.size == 0){
			response = true;
		}
		return response;
	}

	// Add element to the back
	public void enqueue(Node newNode) {
		if(front == null){
			rear = newNode;
			front = newNode;
			size++;
		}
		else{
			rear.setNext(newNode);
			rear = newNode;
			size++;
		}
		
	}


	public String dequeue(){
		Node response = null;
		//element in the list
		if(front!=null){
			//more than 1 element
			if(front.getNext()!=null){
				response = new Node(front.getData());
				front = front.getNext();
				size--;
			}
			else{
				response = new Node(front.getData());
				front = null;
				rear = null;
				size--;
			}
		}
		else{

		}
		return response.getData();
	}	

	public Node peek(){
		Node response = null;

		if(!isEmpty()){
			//returning only the data
			response = new Node(front.getData());
		}

		return response;
	}

	public int getSize(){
		return this.size;
	}

	public void displayQueue(){
		  // check for stack underflow
        if (this.front == null) {
            System.out.println("No elemnt in the Queue");
        }
        else {
            Node temp1 = this.front;
            while (temp1 != null) {
 
                // print node data
                System.out.println(temp1.getData());
 
                // assign temp link to temp
                temp1 = temp1.getNext();
            }
        }
	}
	
}