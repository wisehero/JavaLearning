package JavaStandard.ch09.StringToTokenizer;

import java.util.StringTokenizer;

public class StringToTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true); // 구분자도 토큰으로 간주

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
