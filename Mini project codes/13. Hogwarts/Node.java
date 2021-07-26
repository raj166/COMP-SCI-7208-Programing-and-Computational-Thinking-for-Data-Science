//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical exam 05
//===================================
public class Node extends Student{

    // node next points to next node in list
    public Node next;

    //student info store info of student
    public Student info;


    //Basic Constructor
    Node(){
        this.next = null;

    }

    //PARAMATRIC CONSTRUCTOR
    Node(Student tempStudent){
        this.info = tempStudent;
        this.next = null;
    }

    //ACCESSORS using  student info to get values 
    public Student getInfo(){
        return this.info;
    }

    public String getName(){
        return this.info.getName();
    }

    public int getAge(){
        return this.info.getAge();
    }

    public int getPeriod(){
        return this.info.getPeriod();
    }

    public Node getNext(){
        return this.next;
    }

    //MUTATTORS
    public void setName(String name){
        this.info.setName(name);
    }

    public void setAge(int age){
        this.info.setAge(age);
    }

    public void setPeriod(int period){
        this.info.setPeriod(period);
    }

    public void setNext(Node next){
        this.next = next;
    }
    public void setInfo(Student student){
        this.info = student;
    }




}