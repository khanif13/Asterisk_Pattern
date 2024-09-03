package Pattern;

import java.util.Scanner;

public class Pattern033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 3; i++) {
            if (i == 1 || i == 3) {
                System.out.print("+");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 3) {
                    System.out.print("---+");
                } else {
                    if (j % 2 == 1) {
                        System.out.print("| x ");
                    }
                    if (j % 2 == 0) {
                        System.out.print("| o ");
                    }
                    if (j == n) {
                        System.out.print("|");
                    }
                }
            }
            System.out.println();
        }
    }
}
