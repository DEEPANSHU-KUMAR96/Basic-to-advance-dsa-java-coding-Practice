package com.LambdaCode;

import java.util.List;

public class StreamFilterAndConcatenate {
    public static void main(String[] args) {
        List<String>strs = List.of("Deepanshu is a very good Coder\n", "coder", "Bca pass out student", "from");
        String results = strs.stream()
                .filter(str -> str.length() >8)
                .reduce("",(a,b) -> a + " " +b);
        System.out.println(results);
    }
}
