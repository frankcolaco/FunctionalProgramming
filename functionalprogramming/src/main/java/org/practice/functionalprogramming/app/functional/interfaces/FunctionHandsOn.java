package org.practice.functionalprogramming.app.functional.interfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionHandsOn {

    public static void main(String[] args) {
        Function<String,Integer> lengthOfString = String::length;

        List<String> strings = List.of("KitKat","Oreo","Cookies");

        List<Integer> strLengths = map(strings,lengthOfString);
        System.out.println(strLengths);
    }

    private static <T,R> List<R> map(List<T> strings, Function<T, R> lengthOfString) {

        return strings.stream().map(lengthOfString).collect(Collectors.toList());
    }
}
