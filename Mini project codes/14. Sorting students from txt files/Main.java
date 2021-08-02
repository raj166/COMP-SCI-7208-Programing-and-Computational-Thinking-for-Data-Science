//==================================
// Foundations of Computer Science
// Student: Raj Patel	
// id: a1809073
// Semester: 1
// Year: 2021
// Practical: Practical 05
//===================================

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.File;

public class Main extends Student{

	private static Student[] readData(String filename) throws IOException{
		
		//counting number of lines in the file
		int count = 0;
		try {
			// create a new file object
			File file = new File(filename);
			// create an object of Scanner
			// associated with the file
			Scanner sc = new Scanner(file);

			// read each line and
			// count number of lines
			while(sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
		}
		catch(Exception e){
		  	System.out.println(e);
		}

		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);

		//name
		String str , name;
		//int marks 
		int marks1,marks2,marks3;
		//Double Average marks
		double marks4;

		//creating student array of length count-> number of lines
		Student[] student_obj = new Student[count];
		int i = 0;

		while((str = br.readLine())!=null){
			String[] arrOfStr = str.split(" ", 4);
			//name
			name = arrOfStr[0];
			//Physics marks
			marks1 = Integer.parseInt(arrOfStr[1]);
			//chemistry marks
			marks2 = Integer.parseInt(arrOfStr[2]);
			//maths marks
			marks3 = Integer.parseInt(arrOfStr[3]);
			//creating student arrray and initaling its value 
			student_obj[i] = new Student(name , marks1 , marks2, marks3);
			i++;
		}
		return student_obj;

	}

	//comparing the marks -> average -> physic -> chemistry -> math
	//if a>b it return 1 if a=b it return 0 and if b>a then it return 2
	public static int compareMarks(Student a , Student b)
    {	
        if(a.get_average() == b.get_average()){
        	if(a.get_physic() == b.get_physic()){
        		if(a.get_chemistry() == b.get_chemistry()){
        			if (a.get_math() == b.get_math()){
        				return 0;
        			}//math
        			else if (a.get_math() > b.get_math()) {
        				return 1;	
        			}
        			else{
        				return 2;
        			}//maths
        		}//chem
        		else if(a.get_chemistry() > b.get_chemistry()) {
        			return 1;	
        		}
        		else{
        			return 2;
        		}//chemistry
        	}//phy
        	else if(a.get_physic() > b.get_physic()) {
        		return 1;	
        	}
        	else{
        		return 2;
        	}//physics
        }//avg
        else if (a.get_average() > b.get_average()) {
        	return 1;
        }
        else{
        	return 2;
        }//average

    }//compareMarks

    //the sortStudents arranges the array in asending order we want it in decending order
    public static Student[] reverseArray(Student[] students){
    	int n = students.length;
        Student[] reversed_array = new Student[n];
        int j;
        for (int i =0; i<n ;i++){
            j = n-i-1;
            reversed_array[j] = students[i];   
         } 
        return reversed_array;
    }

    //sorts the student in asending order of therir average marks
	public static Student[] sortStudents(Student[] students){
		//System.out.println(compareMarks(students[0],students[1]));
		int n = students.length;

		for (int i = 1; i < n; ++i){

            Student key = students[i];
            int j = i - 1;

            //comparing the elemts on the left till bigger element is found and then its being replaced
            while (j >= 0 && compareMarks(students[j],key)<=1) {

                students[j + 1] = students[j];
                j = j - 1;

            }//while

            students[j + 1] = key;

        }//for

		return students;
	}

	//PRINTING THE SORTED ARRAY
	public static void printStudents(Student[] students){
		System.out.println("Student AverageScore  Physics Chemistry Maths");
		for (int i = 0 ; i< students.length ; i++) {
				System.out.format("%8s%8.2f%8d%8d%9d %n",students[i].get_name() , students[i].get_average() ,students[i].get_physic(), students[i].get_chemistry() , students[i].get_math()   );
		}		
	}

	public static void main(String[] args) throws IOException {
		
		Student[] obj = new Student[20];
		obj = readData("students.txt");

		System.out.println("Before Sorting the students :");
		printStudents(obj);
		System.out.format("%n%n%n");
		System.out.println("After Sorting the students :");
		obj = sortStudents(obj);
		obj = reverseArray(obj);
		printStudents(obj);
		
	}
}