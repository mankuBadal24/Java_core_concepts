package GFG_questions;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int f1 = 0, f2 = 1, f3,  i = 0;
        System.out.println("first no. is " + f1 + "\nsecond no. is " + f2);
        System.out.println("enter the digits"); 
        Scanner mo = new Scanner(System.in);
        mo.close();
            int n = mo.nextInt();
            while(i<n){
                f3 = f1 + f2;
                System.out.println(f3);
                f1 = f2;
                f2 = f3;
                i++;
            }
    }
} 
