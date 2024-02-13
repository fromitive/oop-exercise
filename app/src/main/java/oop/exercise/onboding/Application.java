package oop.exercise.onboding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) throws IOException {
        // 1. 입력값
        InputStreamReader ir = new InputStreamReader(System.in);
        final Pattern pattern = Pattern.compile("//(.)\n(.*)");
        var calculator = new CustomAdder(pattern); //패턴 설정
        try (BufferedReader br = new BufferedReader(ir)) {
            //입력값 설정
            String input = br.readLine();
            // 2. 추출
            calculator.setFormula(input);
            // 3. 계산
            int result = calculator.calculate();
            System.out.println(result);
        }
    }
}
