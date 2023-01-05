package org.practice.functionalprogramming.main;

import java.util.Optional;

public class OperationsOnOptionalHandsOn {

    public static void main(String[] args) {

        Optional<String> oStr = Optional.empty();
        Optional<String> oStr1 = Optional.of("functional");
        System.out.println(oStr1.map(val -> "replace"));
        // map
        System.out.println(oStr.map(val-> "Replaced").orElse("Empty"));

        //filter
        System.out.println(oStr1.filter(val -> val.equalsIgnoreCase("function")).orElse("Not Matching Criteria"));

        //flatMap

        System.out.println(oStr1.flatMap(val -> Optional.of("Replace")).orElse("Empty"));
    }
}
