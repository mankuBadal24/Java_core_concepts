package patterns;

public class Hollow_diamond {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space += 2;
        }
        int spaces = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
    }
}
