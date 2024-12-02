package patterns;

public class Pattern_Number {

    public static void main(String[] args) {
    //print an increasing triangle of 0 and 1 
        int n = 5;
        for (int i = 0; i < n; i++) {
            int start = 1;
            if (i % 2 == 0)
                start = 1;
            else
                start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
