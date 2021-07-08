//==================================
// Foundations of Computer Science
// Student: Raj Patel
// id: a1809073
// Semester: 1
// Year: 2021
// Practical Number: practical 04
//===================================

import java.util.Random;

public class ShakingParty{

    public int N;

    //Constructor
    ShakingParty(){
        Random random = new Random();
        // Generates random integers 0 to 10
        int x = random.nextInt(10);
        this.N =x;
    }

    ShakingParty(int dTmp){
        this.N = dTmp;
    }

    //recursvice all with base condition 
    public  int handshake(int n){
        //base condition
        if (n == 0)
            return 0;
        else
            return (n - 1) + handshake(n - 1);
    }


    //calling the recursvice method 
    public void countHandShakes(){
        int n = this.N;
        int x = handshake(n);
        System.out.println(x);
    }
}
