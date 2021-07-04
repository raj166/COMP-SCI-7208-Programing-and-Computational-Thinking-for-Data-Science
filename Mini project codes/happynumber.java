
import java.util.Scanner;

public class happynumber{

	private static int sumOfNumbers(int n){
		int sum=0, r;
		//checking for happy number or not a happy number
		while(sum!=1 && sum!=4)
		{
			sum=0;
			while(n>0)
			{
				r=n%10;
				sum+=(r*r);
				n=n/10; 
			}
			n=sum;
		}
		return sum;
	}

	public static int nextHappyNum(int number){
		int sum=0,r;
		//increase the number as we want the next happy number
		int i = ++number;
		boolean loopEntry = true;
		while(loopEntry){
				
				//checking for happy number
				sum = sumOfNumbers(i);
				
				//if the number is happy number then loopentry = false and jump out of the lopp using break
				if(sum==1){
					loopEntry = false;
					break;
				}
				//if not a happy number check for the next number 
				else if (sum!=1) {
					i = nextHappyNum(i++);
				}
					
		 	}//while
		return i;
	}
  

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int next_happynumber = nextHappyNum(n);
	    System.out.println(next_happynumber);
	   
	    
	}
}