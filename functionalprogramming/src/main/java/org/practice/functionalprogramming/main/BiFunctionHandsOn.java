package org.practice.functionalprogramming.main;

import java.util.function.BiFunction;

public class BiFunctionHandsOn {

    public static void main(String[] args) {
        BiFunction<String,String,Integer>biFunction = (a,b)-> (a+b).length();

        System.out.println(biFunction.apply("functional","programming"));
    }
}
