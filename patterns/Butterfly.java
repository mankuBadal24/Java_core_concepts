package patterns;

public class Butterfly {
    public static void main(String[] args) {
        int n =5;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i >= 0; i--) {
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=n;i++)
        {
             for(int j=1;j<=i;j++)
            {
                System.out.print("*"); // first half first part
            }
            int space = 2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
           
        }
         for(int i=n-1;i>=1;i--)
        {
             for(int j=1;j<=i;j++)
            {
                System.out.print("*"); // first half first part
            }
            int space = 2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
           
        }
    }
}