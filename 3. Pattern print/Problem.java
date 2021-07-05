/* 
   print * for value between 1-9 
   print = for value between 10-20
   print X or value between 21-30
   print * for value between 31-40
 */
public class Problem{

	public static void main(String[] args){
		
		for (int num=1; num<=40;num++ ) {
			
			switch(num){
				
				//(0,10] -> print "*"
		  		case 1: case 2: case 3: case 4: case 5 :case 6: case 7: case 8: case 9:

			     		for(int i = 0; i<num; i++){
							System.out.print("*");
						}//for loop ends 
			     		break;

		     		//[10,20)-> print "="
		  		case 10: case 11: case 12: case 13: case 14: case 15 :case 16: case 17: case 18: case 19:

			     		for(int i = 0; i<num; i++){
							System.out.print("=");
						}//for loop ends 
			     		break;

			     	// [20,30) -> print "X"
			     	case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: 
		     		
			     		for(int i = 0; i<num; i++){
							System.out.print("x");
						}//for loop ends 
			     		break;

			     	// [30,40]-> print "*"
			     	case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: 

			     		for(int i = 0; i<num; i++){
							System.out.print("o");
						}//for loop ends 
			     		break;

		    	}// switch case ends 

		    	//prints new empty line after each for loop
		    	System.out.println("");

			
		}//end of for loop
		
	}// end of main method

}//end of Problem class
