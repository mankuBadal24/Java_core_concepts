package patterns;

public class Decresing {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A', fo;
        for (int i = 1; i < n; i++)
            ch++;
        fo = ch;
        for (int i = 1; i <= n; i++) {
            ch = fo;
            for (int j = 1; j <= i; j++) {
                System.out.print(ch--);
            }
            System.out.println();
        }
    }
}
