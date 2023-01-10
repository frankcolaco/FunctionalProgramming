package org.practice.functionalprogramming.app.functional.interfaces;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorHandsOn {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,4,6,4,3,7,8,9,2);
        UnaryOperator<Integer> operator = i -> i*100;

        List<Integer> operatedList = map(integers,operator);
        System.out.println(operatedList);
    }

    private static <T> List<T> map(List<T> integers, UnaryOperator<T> operator) {

        return integers.stream().map(operator).collect(Collectors.toList());
    }
}
