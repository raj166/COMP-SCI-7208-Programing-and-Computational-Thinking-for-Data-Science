import java.util.Scanner;

public class RectangleArea extends Rectangle3{
	
	Scanner input = new Scanner(System.in);
	
	public void read_input(){
		
		boolean loop_entry = true;
		
		try{
			while(loop_entry){
			
				super.width = input.nextInt();
				super.height = input.nextInt();
				
				if(super.width<1){
					//width constraint
					System.out.println("Enter the correct width and height again");
				}
				else if (super.height>10000){
					//height constraint
					System.out.println("Enter the width and correct height again");
					
				}
				else{
					loop_entry = false;
				}
			}//end of while
		}//end of try
		catch(Exception e){
			System.out.println("You have Entered wrong input!!");
			System.exit(1);
		}//end of catch 
	}//end of read_input

	@Override
	public void display(){

		System.out.format("%n%n%d %d %n%d %n%n%n ", super.width , super.height , super.width * super.height);

	}//display

	public static void main(String[] args) {
		
		//creating area_obj to acess the methods of RectangleArea class
		RectangleArea area_obj = new RectangleArea();

		//read input method
		area_obj.read_input();

		//dispaly output area
		area_obj.display();

	}//end of main	
}//end of RectangleArea
