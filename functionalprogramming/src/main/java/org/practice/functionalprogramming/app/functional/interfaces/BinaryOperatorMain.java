package org.practice.functionalprogramming.app.functional.interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {

    public static void main(String[] args) {
        BinaryOperator<String> operator = (a,b)->a+"."+b;

        System.out.println(operator.apply("functional","programming"));
    }
}
