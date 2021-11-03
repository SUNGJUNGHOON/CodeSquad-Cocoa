package mission;

import java.util.Random;
import java.util.Scanner;
//코코아 과정 멤버들중 원하는 수만큼 랜덤 출력하는 문제
public class CocoaRandom {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] names = {"a","b","c","d","e"};

        System.out.println("멤버는 현재 " + names.length + "명 입니다, 출력할 사람수를 입력하세요.");
        int numberOfPeople = scanner.nextInt();

        for (int i = 0; i < numberOfPeople; i++)
            System.out.println();
        }
    }
