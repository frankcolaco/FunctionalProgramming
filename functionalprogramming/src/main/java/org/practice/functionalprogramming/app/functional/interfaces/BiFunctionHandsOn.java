package org.practice.functionalprogramming.app.functional.interfaces;

import java.util.function.BiFunction;

public class BiFunctionHandsOn {

    public static void main(String[] args) {
        BiFunction<String,String,Integer>biFunction = (a,b)-> (a+b).length();

        System.out.println(biFunction.apply("functional","programming"));
    }
}
