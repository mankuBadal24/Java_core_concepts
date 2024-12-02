import java.util.Scanner;

public class Concep_while {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int osum = 0;
        int r = 0;
        int esum = 0;
        sc.close();
        while (n > 0) {
            r = n % 10;
            if (r % 2 == 0)
                esum += r;
            else
                osum += r;
            n = n / 10;
        }
        System.out.print(esum);
        System.out.print(osum);
    }
}
