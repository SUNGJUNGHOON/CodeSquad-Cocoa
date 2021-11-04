package mission;

public class GugudanTwo {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단 입니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
