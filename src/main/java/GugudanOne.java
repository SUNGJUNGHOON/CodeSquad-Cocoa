import java.util.Scanner;

public class GugudanOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("출력할 단을 숫자로 입력 하세요. [ex) 3단 => 3 ]");
        int dan = scanner.nextInt();
        System.out.println(dan + "단의 몇까지 곱하시겠습니까? ☆숫자로 입력하세요★");
        int count = scanner.nextInt();

        for (int j = 1; j <= count; j++) {
            System.out.println(dan + " x " + j + " = " + dan * j);
        }
        System.out.println();
    }
}

