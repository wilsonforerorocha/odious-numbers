package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,50)
                .filter(n -> {
                    final String binaryString = Integer.toBinaryString(n);
                    final long countsOne = binaryString.chars().filter(ch -> ch == '1').count();
                    return !(countsOne%2 == 0);
                }).forEach(System.out::println);
    }
}