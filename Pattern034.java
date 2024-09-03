package Pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Pattern034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        for (int i = 1; i <= 3; i++) {
            if (i == 1 || i == 3) {
                System.out.print("+");
            }
            for (int j = 0; j < n.length(); j++) {
                char angka = n.charAt(j);
                if (i == 1 || i == 3) {
                    System.out.print("---+");
                }
                else if (angka == '1') {
                    System.out.print("| x ");
                }
                else if (angka == '0') {
                    System.out.print("| o ");
                }
                if (i == 2 && j == n.length() - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
