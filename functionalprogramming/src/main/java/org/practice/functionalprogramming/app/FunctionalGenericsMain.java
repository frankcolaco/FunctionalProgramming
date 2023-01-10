package org.practice.functionalprogramming.app;

import org.practice.functionalprogramming.functioninterfaces.FunctionalGenerics;

public class FunctionalGenericsMain {

    public static void main(String[] args) {
        FunctionalGenerics<String,Integer> functionalGenerics = String::length;
        System.out.println(functionalGenerics.execute("functionalProgramming"));

        FunctionalGenerics<String,String> functionalGenerics1 = s -> s.substring(1);
        System.out.println(functionalGenerics1.execute("functionalProgramming"));
    }
}
