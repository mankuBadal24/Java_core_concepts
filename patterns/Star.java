package patterns;

import java.util.Scanner;

public class Star {
    public static void main(String []args){
    Scanner hi = new Scanner(System.in);
    int n = hi.nextInt();
    hi.close();
    
    for(int i =1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}

