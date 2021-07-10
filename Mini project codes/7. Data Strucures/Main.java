public class Main {
	public static void main(String[] args) {

		System.out.format("%n%n%n-----------------------Stack Implementation-----------------------%n%n");
		
		System.out.format("Stack implementation %n%n");
		//creating the object of stack
		MyStack stack = new MyStack();
		System.out.println("Stack Values ");
		stack.display(); 
		//inserting hi and why in the stack 
		System.out.println("Inserting 2 elements");
		stack.push(new Node("hi"));
		stack.push(new Node("this"));
		System.out.println("Stack Values ");
		stack.display(); 
		//inserting third value
		System.out.println("Inserting 2 more elements");
		stack.push(new Node("is"));
		stack.push(new Node("Raj"));
		System.out.format("%n%nStack Values%n");
		stack.display();
		Node temp = stack.peek();
		System.out.println("Peek into the stack " + temp.getData());
		//poping out the values from the stack  
		System.out.print("Pop elemt from stack: ");
		temp = stack.pop();
		System.out.println("Removed element " + temp.getData());
		System.out.format("%n%nStack Values%n");
		stack.display();
		System.out.print("Pop elemt from stack: ");
		temp = stack.pop();
		System.out.println("Removed element " + temp.getData());
		System.out.format("%n%nStack Values%n");
		stack.display(); 
		System.out.print("Pop elemt from stack: ");
		temp = stack.pop();
		System.out.println("Removed element " + temp.getData());
		System.out.print("Pop elemt from stack: ");
		temp = stack.pop();
		System.out.println("Removed element " + temp.getData());
		System.out.format("%n%nStack Values%n");
		stack.display(); 
		System.out.format("%n%n%n-----------------------Finish Stack Operation-----------------------%n%n");
		


		System.out.format("%n%n%n-----------------------Brackets Matching Example-----------------------%n%n");
		System.out.println("1) Input = ({[]}) -> "+bracketsMatching("({[]})"));
		System.out.println("2) Input = ({) -> "+bracketsMatching("({)"));
		System.out.println("3) Input = (1+2) * {(2+3)*(3+4)} -> "+bracketsMatching("(1+2) * {(2+3)*(3+4)}"));
		System.out.println("4) Input = (1+2) * {{2+3)*(3+4}} -> "+bracketsMatching("(1+2) * {{2+3)*(3+4}}"));
		System.out.println("5) Input = (a+b) * {{c+D)*(E+F}} -> "+bracketsMatching("(a+b) * {{c+D)*(E+F}}"));
		System.out.println("6) Input = (a+b) * {{c+D}*{E+F}} -> "+bracketsMatching("(a+b) * {{c+D}*{E+F}}"));
		System.out.format("%n%n%n-----------------------Brackets Matching Finish-----------------------%n%n");
		

		System.out.format("%n%n%n-----------------------Queue Implementation-----------------------%n%n");
		MyQueue queue = new MyQueue();
		System.out.format("Queue Value at start from front to rear %n");
		queue.displayQueue();
		queue.enqueue(new Node("Hi"));
		queue.enqueue(new Node("this"));
		queue.enqueue(new Node("is"));
		queue.enqueue(new Node("Raj"));
		System.out.format("%nQueue Value after inserting 4 Nodes From front to rear %n");
		queue.displayQueue();
		queue.enqueue(new Node("Who"));
		queue.enqueue(new Node("are"));
		queue.enqueue(new Node("you"));
		queue.enqueue(new Node("?"));
		System.out.format("Queue Values  after adding 8 nodes from front to rear %n");
		queue.displayQueue();
		queue = reverseQueue(queue);
		System.out.println("Queue after being reversed.");
		queue.displayQueue();
		System.out.println("Size of the queue at presnet "+queue.getSize());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Size of the queue at presnet "+queue.getSize());
		temp = queue.peek();
		System.out.println("The front node is pointing to "+temp.getData());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Removing element " +queue.dequeue());
		System.out.println("Size of the queue at presnet "+queue.getSize());
		System.out.format("%n%n%n-----------------------Queue Implementation Finish-----------------------%n%n");
		
	}

	public static boolean bracketsMatching(String input){
		
		//crating a stack
		MyStack stack = new MyStack();
		
		//checking the legth of the input for empty string
		if(input == null || input.length() == 0){
			return true;
		}//if loop
		
		//declaring variable
		char j;
		String v,c;
		//using Node data type as the peek method return node
		Node temp;
		//for loop till the end of the string
		for (int i = 0; i< input.length() ; i++){
			//taking individaula char from the string
			j = input.charAt(i);
			//checks for if j == ')'
			if(j == ')'){
				//peep return the node and hence stored in temp and then using temp.data to get the value of the top node 
				temp = stack.peek();
				c = temp.getData();
				//comparing the opposite brackets 
				if(!stack.isEmpty() && c.charAt(0) == '('){
					//pop the bracket
					stack.pop();
				}
			}
			//checks for if j == '}'
			else if(j == '}'){
				//peep return the node and hence stored in temp and then using temp.data to get the value of the top node 
				temp = stack.peek();
				c = temp.getData();

				//comparing the opposite brackets 
				if(!stack.isEmpty() && c.charAt(0) == '{'){
					stack.pop();
				}
			}
			//checks for if j == '}'
			else if(j == ']'){	
				//peep return the node and hence stored in temp and then using temp.data to get the value of the top node 
				temp = stack.peek();
				c = temp.getData();
				
				//comparing the opposite brackets 
				if(!stack.isEmpty() && c.charAt(0) == '['){
					stack.pop();
				}
			}
			//checking for any arithmethic operator , white space , numeric value and alphabets 
			else if(j == '%' || j == '/' || j == '*' || j == '+' || j == '-' || Character.isDigit(j) || j == ' ' || (j >= 'a' && j <= 'z') || (j >= 'A' && j <= 'Z') ){	
				//perform nothing just skip
				continue;
			}
			else{
				//converting the char to string as push method takes string as parameter
				v = Character.toString(j);
				//inserting the open brackets
				stack.push(new Node(v));
			}
		}//for loop
		//checks after the for loop ends is there anyting in the stack or not 
		if(stack.isEmpty()){
			//if empty
			return true;
		}
		else{
			//if not empty
			return false;
		}
	}//bracketsMatching

	public static MyQueue reverseQueue(MyQueue queue){
		
		//creating stack object
		MyStack stack = new MyStack();

		//while the queue is not empty bee in the loop
		while(!queue.isEmpty()){
			//push the element dequeue from queue
			stack.push(new Node(queue.dequeue()));
		}


		while(!stack.isEmpty()){
			//enqueue the element poped from stack 
			queue.enqueue(stack.pop());
		}
		
		return queue; 
	}
}