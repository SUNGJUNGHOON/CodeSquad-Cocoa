package mission;

import java.util.Scanner;

public class IndianName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 생년, 월, 일을 입력해 주세요 ex)1998>Enter>10>Enter>31>Enter");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        IndianNameMain indianNameMain = new IndianNameMain(year, month, day);
        indianNameMain.a();
    }
}
