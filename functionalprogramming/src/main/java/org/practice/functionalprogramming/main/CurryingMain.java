package org.practice.functionalprogramming.main;

public class CurryingMain {

    public static void main(String[] args) {

        Function<Integer, Function<Integer,Integer>> function1 = u-> v-> u+1+ v;

        System.out.println(function1.apply(1).apply(4));

    }
}
