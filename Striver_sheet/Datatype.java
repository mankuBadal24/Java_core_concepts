// package Striver_sheet;

import java.util.Scanner;
//import java.io.*;

public class Datatype {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 0; i <= n; i++) {
                count = count + i;
            }
            System.out.println(count);
        }
    }
}
