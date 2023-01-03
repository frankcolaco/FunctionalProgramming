package org.practice.functionalprogramming.main;

import org.practice.functionalprogramming.functioninterfaces.Name;

// use case 1: Method with no parameter, no return type
public class LambdaPractice1 {

    public static void main(String[] args) {
        Name name = () -> System.out.println("Frank");
        name.myName();
    }
}
