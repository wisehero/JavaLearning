package backjoon.backjoonif;

import java.util.Scanner;

//     첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//      두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class exam01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("두 수를 입력하세요.");
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
