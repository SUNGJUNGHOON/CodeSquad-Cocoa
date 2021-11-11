package accountbookstore;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList> list = new ArrayList<>();
        login(list);
        System.out.println("가계부를 시작합니다");
        menu(list);
    }

    public static void menu(ArrayList<ArrayList> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 > 데이터 입력, 2 > 데이터 수정, 3 > 데이터 삭제, 4 > 데이터 보기");
        int answer = scanner.nextInt();

        if (answer == 1) {
            input(list);
        } else if (answer == 2) {

        } else if (answer == 3) {
            delete(list);
        } else {
            showAccount(list);
        }
    }

    public static void login(ArrayList<ArrayList> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID를 입력하세요");
        String name = scanner.next();
        System.out.println("PW를 입력하세요");
        String password = scanner.next();

        System.out.println("안녕하세요" + name + "님");
    }

    public static void input(ArrayList<ArrayList> list) {
        Scanner scanner = new Scanner(System.in);

        ArrayList data = new ArrayList();

        System.out.println("날짜를 입력하세요");
        String date = scanner.nextLine();
        System.out.println("비고를 입력하세요");
        String memo = scanner.nextLine();
        System.out.println("수입을 입력하세요");
        int income = scanner.nextInt();
        System.out.println("지출을 입력하세요");
        int expenditure = scanner.nextInt();

        data.add(date);
        data.add(memo);
        data.add(income);
        data.add(expenditure);
        list.add(data);

        menu(list);
    }

    public static ArrayList<ArrayList> delete(ArrayList<ArrayList> list) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇번째 항목을 삭제 하시겠습니까?");
        list.remove(scanner.nextInt() - 1);
        System.out.println("삭제를 완료 하였습니다.");
        return list;
    }

    public static void showAccount(ArrayList<ArrayList> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(list.get(i).get(j));
            }
        }
    }
}
