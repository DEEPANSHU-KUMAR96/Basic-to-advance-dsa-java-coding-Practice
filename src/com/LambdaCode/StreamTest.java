package com.LambdaCode;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Apple","Banana","Coding");
        names.stream()
                .forEach(name-> System.out.println(name) );
    }
}
