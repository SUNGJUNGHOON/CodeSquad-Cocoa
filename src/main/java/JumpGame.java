import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점프 게임에 오신것을 환영합니다. 참여자는 몇 명입니까? *숫자만 입력하세요*");
        int person = scanner.nextInt();
        System.out.println("점프 주사위가 4이상이 나올시에 점프합니다. 점프 주사위를 몇번 굴리시겠습니까?");
        int rollTheDice = scanner.nextInt();

        JumpGameMain jumpGameMain = new JumpGameMain(person, rollTheDice);
        jumpGameMain.person();
    }
}
