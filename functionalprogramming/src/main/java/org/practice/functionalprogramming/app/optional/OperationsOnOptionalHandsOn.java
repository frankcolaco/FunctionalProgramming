package org.practice.functionalprogramming.app.optional;

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

        //ifPresent

        Optional<String> oStr2 = Optional.of("functionalProgramming");
        oStr2.ifPresent(System.out::println);

        //ifPresentOrElse

        Optional.empty().ifPresentOrElse(System.out::println,()-> System.out.println("Optional is empty"));

        // stream
        oStr2.stream().forEach(System.out::println);
        Optional.empty().stream().forEach(System.out::println);

        // OR similar to ifPresent but executes in case optional is empty
        Optional.empty().or(()-> Optional.of("newFunctionalProgramming")).ifPresent(System.out::println);
        oStr2.or(()-> Optional.of("noValue")).ifPresent(System.out::println);

        //equals

        System.out.println("two optionals are equal:: "+
                oStr2.equals(oStr1));


    }
}
