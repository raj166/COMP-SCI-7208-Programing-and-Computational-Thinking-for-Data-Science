//==================================
// Foundations of Computer Science
// Student: Raj Patel
// id: a1809073
// Semester: 1
// Year: 2021
// Practical Number: practical 04
//===================================


import java.util.Random;

public class ShakingPartyConstrainted{

    public int N;

    //constructor
    ShakingPartyConstrainted(){
        Random random = new Random();
        // Generates random integers 0 to 10
        int x = random.nextInt(10);
        this.N =x;
    }

    ShakingPartyConstrainted(int dTmp){
        this.N = dTmp;
    }

    //resursive method handshake
    public  int handshake(int n){
        //base condition
        if(n <= 1){
            return 0;
        }
        else{
            return 3 * (n - 1) + handshake(n-1);
        }

    }

    //first call to the recursive method
    public void countHandShakes(){
        int n = this.N;
        int x = handshake(n);
        System.out.println(x);
    }


}