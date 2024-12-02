package patterns;

public class Pattern_Striver {
    public static void main(String[] args) {
        int n = 5;
        int p = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
        // for (int i = n; i >= 0; i--) {
        // for (int j = 2; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}
