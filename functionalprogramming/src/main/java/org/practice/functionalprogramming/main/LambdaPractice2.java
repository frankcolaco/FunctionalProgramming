package org.practice.functionalprogramming.main;

import org.practice.functionalprogramming.functioninterfaces.MathOperation;

//use case 2: method with parameter, no return type
public class LambdaPractice2 {

    public static void main(String[] args) {

        MathOperation sum = (a,b) -> System.out.println(a+b);
        MathOperation multiply = (a,b)-> System.out.println(a*b);
        sum.operation(10,5);
        multiply.operation(10,5);

    }
}
