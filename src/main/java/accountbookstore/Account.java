package accountbookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private final static List<AccountData> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자 ID를 입력하세요");
        String userName = scanner.nextLine();
        System.out.println("비밀번호를 입력하세요");
        String passWord = scanner.nextLine();

        System.out.println("안녕하세요" + userName + "님 환영합니다!");
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴를 입력하세요");
            System.out.println("1 : 데이터 입력, 2 : 데이터 수정, 3 : 데이터 삭제, 4 : 데이터 보기, 5 : 종료");
            int selectedNumber = Integer.parseInt(scanner.nextLine());

            if (selectedNumber < 1 || selectedNumber >= 6) {
                System.out.println("숫자를 잘못 입력하셨습니다.");
                return;
            }
            System.out.println("선택한 메뉴 : " + selectedNumber);

            switch (selectedNumber) {
                case 1: {
                    insertData();
                    break;
                }
                case 2: {
                    reviseData();
                    break;
                }
                case 3: {
                    deleteData();
                    break;
                }
                case 4: {
                    showData();
                    break;
                }
                case 5: {
                    System.out.println("가계부를 종료합니다");
                    return;
                }
            }
        }
    }

    private static void insertData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("날짜를 입력하세요");
        String date = scanner.nextLine();
        System.out.println("적요를 입력하세요");
        String summary = scanner.nextLine();
        System.out.println("수입을 입력하세요");
        String income = scanner.nextLine();
        System.out.println("지출을 입력하세요");
        String expend = scanner.nextLine();

        AccountData accountData = new AccountData(date, summary, income, expend);
        accounts.add(accountData);

    }

    private static void reviseData() {

    }

    private static void deleteData(AccountData accountData) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("삭제할 항목을 선택하세요");
        accountData.remove(scanner.nextInt() - 1);
        System.out.println("삭제를 완료 하였습니다");
        return;
    }

    private static void showData() {
        for (AccountData account : accounts) {
            System.out.println("날짜는 " + account.getDate() + "입니다.");
            System.out.println("적요는 " + account.getSummary() + "입니다.");
            System.out.println("수입은 " + account.getIncome() + "입니다.");
            System.out.println("지출은 " + account.getExpend() + "입니다.");
            System.out.println("---------");
        }
    }
}

