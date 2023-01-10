package org.practice.functionalprogramming.app;

import org.practice.functionalprogramming.functioninterfaces.LengthOfString;

//use case 4: method with multiple statements
public class LambdaPractice4 {


    public static void main(String[] args) {
        LengthOfString lengthOfString = s -> {
            int l = s.length();
            System.out.println("Length of string:: "+ l);
            return l;
        };

        lengthOfString.length("reactiveProgramming");
    }
}
