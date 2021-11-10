package mission;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map member = new LinkedHashMap();
        login(member);
        System.out.println("가계부를 시작합니다");
        ArrayList<LinkedHashMap> dataList = new ArrayList<LinkedHashMap>();
        menu(dataList);
    }

    public static void menu (ArrayList<LinkedHashMap> dataList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 > 데이터 입력, 2 > 데이터 수정, 3 > 데이터 삭제, 4 > 데이터 보기");

        int answer = scanner.nextInt();
        if (answer == 1) {
            input(dataList);
        }
        else if (answer == 2) {
            modify(dataList);
        }
        else if (answer == 3) {
            delete(dataList);
        }
        else {

        }
    }

    public static Map login(Map member) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID를 입력하세요");
        member.put("ID", scanner.next());
        System.out.println("PW를 입력하세요");
        member.put("PW", scanner.next());

        System.out.println("안녕하세요" + member.get("ID") + "님");
        return (member);
    }

    public static ArrayList<LinkedHashMap> input(ArrayList<LinkedHashMap> dataList) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap data = new LinkedHashMap();

        System.out.println("날짜를 입력하세요");
        data.put("날짜", scanner.next());
        System.out.println("적요를 입력하세요");
        data.put("적요", scanner.next());
        System.out.println("수입을 입력하세요");
        data.put("수입", scanner.next());
        System.out.println("지출을 입력하세요");
        data.put("지출", scanner.next());

        dataList.add(data);
        menu(dataList);
        return dataList;

    }

    public static ArrayList<LinkedHashMap> modify(ArrayList<LinkedHashMap> dataList) {
        Scanner scanner = new Scanner(System.in);


    }

    public static ArrayList<LinkedHashMap> delete(ArrayList<LinkedHashMap> dataList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇번째 항목을 삭제 하시겠습니까?");
        dataList.remove(scanner.nextInt() - 1);
        System.out.println("삭제를 완료 하였습니다.");
        return dataList;
    }
}
