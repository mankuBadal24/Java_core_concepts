package patterns;

//import java.util.Scanner;

public class IncreasingTriangle {
    public static void main(String[] args) {

        // java program to print inverted half pyramid(decreasing triangle)
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
        int n = 5;
        // program of diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <  i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2 *n-(2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
