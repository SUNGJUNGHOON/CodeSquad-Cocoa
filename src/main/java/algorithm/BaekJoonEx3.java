package algorithm;

import java.util.Scanner;

public class BaekJoonEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int star = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
