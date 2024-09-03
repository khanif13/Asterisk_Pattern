package Pattern;

import java.util.Scanner;

public class Pattern017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // for (int j = 1; j < (2 * (5 - i) - 3); j++) {
        // System.out.print(" ");
        // }
        // if (i != 5 - 1) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                if (j == i) {
                    System.out.print("*");
                }
            }
            for (int j = i; j < n; j++) {
                if (j == n - 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
