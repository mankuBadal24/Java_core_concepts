// package Striver_sheet;

import java.util.Scanner;

public class Alphabet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        char value = sc.next().charAt(0);
        if (value >= 65 && value <= 90)
            System.out.println("1");
        else if (value >= 97 && value <= 122)
            System.out.println("0");
        else
            System.out.println("-1");
    }
}
