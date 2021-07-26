//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical exam 05
//===================================
public class Student {
    // student class variables
    String name;
    int age;
    int period;

    //basic constructor
    Student(){
        this.name = "unknown";
        this.age = 0;
        this.period = 0;
    }

    //parameteric constructor
    Student(String name , int age , int period){
        this.name = name;
        this.age = age;
        this.period = period;
    }

    //prints student info 
    public void printStudent(){
        System.out.println("Printing student record");
        System.out.format("Name: %s %nAge: %d %nPeriod: %d %n", this.name, this.age, this.period);
    }

    //mutators
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setPeriod(int period){
        this.period = period;
    }
    // Acessors
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    int getPeriod(){
        return this.period;
    }


}
