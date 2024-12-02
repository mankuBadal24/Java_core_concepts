package patterns;

public class Patterns_Striver {
    public static void main(String[] args) {
        // decreasing triangle of alphabets
        int n = 3;
        char alpha = 'A';
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
            alpha = 'A';
        }
    }
}
