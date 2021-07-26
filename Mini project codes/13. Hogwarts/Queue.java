//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical exam 05
//===================================
public class Queue extends Node {

    Node front;
    Node rear;
    int number_ofStudents = 0;


    //basic constructor
    Queue(){

        //seting front and rear to null
        this.front = null;
        this.rear = null;
    }

    //enqueue adds student to queue
    public void enqueue(Student tempstudent){
        
        //creating a node using Node(student) parametric constrctor
        Node temp = new Node(tempstudent);

        //check is que empty or not isEmpty() method return tru or false
        if(isEmpty()){

            //first element points to the front of the queue
            this.front = temp;
        }
        else{
            //if the element is not first then cahnge the rear
            this.rear.setNext(temp);
        }
        //set rear to point to new node 
        this.rear = temp;

        //increment of number_ofStudents in the queue
        number_ofStudents++;
    }//enqueue


    //removes student from queue
    public Student dequeue(){
        
        //check is que empty or not isEmpty() method return tru or false
        if(isEmpty()){
            System.out.println("null pointer returned when calling dequeue() on an empty queue");
        }
        //Creating a student object using the values fetched from the first node
        Student temp = new Student(this.front.getName(), this.front.getAge(), this.front.getPeriod());

        //set the front to next node
        this.front = this.front.getNext();

        //decrement of number_ofStudents in the queue
        number_ofStudents--;

        //check is que empty or not isEmpty() method return tru or false
        if(isEmpty()){

            //if empty then rear point to null
            this.rear = null;
        }
        //return temp the student object created
        return temp;
    }//dequeue

  
    
    //display the element/students in the queue
    public void displayQueue(){
        //check is que empty or not isEmpty() method return tru or false
        if (isEmpty()) {
            System.out.println("There are no students waiting for a scholarship");
        }
        // Start from first node
        Node temp = this.front;
        int print_numer = 1;
        // loop till last node
        while(temp!= null){
            //print   starting number and it should be less than number of students
            //suffix for the period
            String period_value;
            switch(temp.getPeriod()){
                case 1:
                    period_value = "st";
                    break;
                case 2:
                    period_value = "nd";
                    break;
                case 3:
                    period_value = "rd";
                    break;
                default:
                    period_value = "";
            }

            //print the data of students
            System.out.format("#%d %s, %d years old, %d%s year in Hogwarts;%n" , print_numer++ , temp.getName(), temp.getAge(), temp.getPeriod(), period_value);
            //set temp to next
            temp = temp.next;
        }//while

    }//displayQueue


    //peek display info of the first student in the queue
    public String peek(){
        // if empty print peek is empty
        if (isEmpty()) {
            System.out.println("Peek empty queue");
            return "";
        }
        //temp point to the first node 
        Node temp1 = this.front;
        // return name of the first student
        return temp1.getName();
        
    }//peek

    //check is que empty or not isEmpty() method return tru or false
    public boolean isEmpty(){
        return(number_ofStudents==0);
    }

}//Queue class 
