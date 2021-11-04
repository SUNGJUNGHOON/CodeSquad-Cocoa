package study;

public class VariableEx1 {
    public static void main(String[] args) {
        int year = 0; //year 변수명에 0으로 초기화
        int age = 14; //age 변수명에 14으로 초기화

        System.out.println(year);
        System.out.println(age);

        year = age + 2000; // year 변수명에 age(14) + 2000 의 값을 초기화
        age = age + 1; // age 변수명에 age(14) + 1 의 값을 초기화

        System.out.println(year);
        System.out.println(age);
    }
}
