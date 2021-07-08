//==================================
// Foundations of Computer Science
// Student: Raj Patel
// id: a1809073
// Semester: 1
// Year: 2021
// Practical Number: practical 04
//===================================

public class HanoiTower{

    public int N;
    //imaginary poles
    public  String from_rod = "Pole1";
    public  String to_rod = "Pole3";
    public  String aux_rod = "Pole2";

    //constructor
    HanoiTower(){
        this.N =3;
    }

    HanoiTower(int dTmp){
        this.N = dTmp;
    }

    //static method which is recursvie
   public static void towerOfHanoi(int n, String from_rod,String to_rod, String aux_rod){
        if (n == 1){
    		System.out.println("Move disk 1 from "+	from_rod+" to "+to_rod);
    		return;
    	}
    	towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    	System.out.println("Move disk "+ n + " from " +	from_rod +" to " + to_rod );
    	towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    //method to call the static method first time 
    public void solve(){
        int n = this.N;
        towerOfHanoi(n , from_rod , to_rod , aux_rod);
    }



}