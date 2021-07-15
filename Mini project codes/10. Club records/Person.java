public class Person {
   
    //member variables
    private String name;
    private int Age;

   
    //Default constructor
    Person(){
        this.name = "anon";
        this.Age = 0;
    }

   
    //parametric constructor
    Person(String name, int age) {
        this.name = name;
        this.Age = age;
    }

   
    //retursn string "Person: __name__ is age: __age__"
    //adding all info to the string returnString one after another
    public String toString(){
        String returnString = "Person: ";
        returnString += this.getName();
        returnString += " is age: ";
        returnString += this.getAge();
        return returnString;
    }//toString

   
    //mutators
    public void setName(String name){
        this.name = name;
    }
   
   
    public void setAge(int age){
        this.Age = age;
    }

   
    //accessors
    public String getName(){
        return this.name;
    }
   
   
    public int getAge(){
        return this.Age;
    }

}//Person calss
