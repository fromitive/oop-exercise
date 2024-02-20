package oop.exercise.onboding;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CustomAdder {
    private final Pattern pattern;
    private final String defaultDelimiters = ":,";

    private final String wow = "인코딩 테스트";
    private List<Integer> operand = new ArrayList<>();

    public CustomAdder(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setFormula(String input) {
        Arrays.stream(getRawOperands(input))
                .map(rawOperand -> Integer.parseInt(rawOperand))
                .forEach(rawOperand -> operand.add(rawOperand));
    }

    public int calculate() {
        return operand.stream().reduce(0,Integer::sum);
    }

    private String [] getRawOperands(String input) {
        final Matcher m = pattern.matcher(input);
        if(m.find()){
            final String customDelimiter = m.group(1);
            String delimiters = setDelimiters(customDelimiter);
            return m.group(2).split(delimiters);
        }
        return input.split(setDelimiters(""));
    }

    private String setDelimiters(String customDelimiter) {
        // input  : "abcde"
        // output : "a|b|c|d|e"
        final String delimiter = defaultDelimiters + customDelimiter;
        return Stream.of(delimiter.split("")).collect(Collectors.joining("|"));
    }
}
