package Pattern;

import java.util.Scanner;

public class Pattern024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n2 = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
        sc.close();
    }
}
