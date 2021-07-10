public class Node{
	
	// the data saved in this node
	private String data;
	
	// the reference to another node
	private Node next;

	//constructor
	Node(){
		this.next = null;
	}

	// Parametrised
	public Node(String value) {
		this.data = value;
		this.next = null;

	}

	// Print the data saved in the node. 
	public void printNode(){
		System.out.println("Node data: " + this.data);
	}

	//get the data
	public String getData(){
		return data;
	}

	//store the data
	public void setData(String value){
		this.data = value;
	}

	//returns the next part of the node
	public Node getNext(){
		return next;
	}

	//sets the next part of the node
	public void setNext(Node next){
		this.next = next;
	}

}