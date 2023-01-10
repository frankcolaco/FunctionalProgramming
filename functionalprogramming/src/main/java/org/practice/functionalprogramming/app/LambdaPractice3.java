package org.practice.functionalprogramming.app;

import org.practice.functionalprogramming.functioninterfaces.LengthOfString;

// Use case 3: Method with Parameter and return type
public class LambdaPractice3 {

    public static void main(String[] args) {
        LengthOfString lengthOfString = String::length;
        System.out.println(lengthOfString.length("functionalProgramming"));
    }

}
