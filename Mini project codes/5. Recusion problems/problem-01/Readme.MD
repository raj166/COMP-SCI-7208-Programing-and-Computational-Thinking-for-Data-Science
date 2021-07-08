##  Problem 01 -> Tower of Hanoi (TOH)
    
    Tower of Hanoi is a mathematical puzzle. It consists of three poles and a number of disks of different
    sizes which can slide onto any poles. The puzzle starts with the disk in a neat stack in ascending
    order of size in one pole, the smallest at the top thus making a conical shape. The objective of the
    puzzle is to move all the disks from one pole (say ‘source pole’) to another pole (say ‘destination
    pole’) with the help of the third pole (say auxiliary pole). 

## Constraints 

    -> Signature:
        
        public class HanoiTower
        constructor: HanoiTower(): initialize 3 disks
        constructor: HanoiTower(dTmp): initialize dTmp disks
        public void solve(): this function should print every step from your tower of Hanoi resolution;
    
    -> For instance:
        
        Move the disk 1 from Pole1 to Pole2
        Move the disk 2 from Pole1 to Pole3
        Move the disk 1 from Pole2 to Pole3
        ...
        Move the disk 1 from Pole1 to Pole3
    
    -> Important:
    
        1. The class HanoiTower MUST NOT contain a public static main function.
        2. In order to test your code, you can create another class Test.java and perform your test from this
        3. In this problem, you are free to define the structure of the problem. For instance, by your choice,
        arrays, variables, or other types to represent the poles, disks etc... It is part of this practice the
        structure and they will not directly influence the marks. However, you are required to provide a clear
        your structure choice in a file: explanation.txt.
