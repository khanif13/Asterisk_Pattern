package Pattern;

import java.util.Scanner;

public class Pattern036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n2 = sc.nextInt();
        for (int i = 1; i <= (n + n2); i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n2; j++) {
                    System.out.print("+---");
                }
                System.out.print("+");
            }
            else{
                for (int j = 1; j <= n2; j++) {
                    System.out.print("| x ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
