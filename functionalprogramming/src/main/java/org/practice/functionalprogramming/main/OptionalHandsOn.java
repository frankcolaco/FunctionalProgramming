package org.practice.functionalprogramming.main;

import java.util.Optional;

public class OptionalHandsOn {

    public static void main(String[] args) {
        Integer integer = 10;
        Optional<Integer>oInteger = Optional.of(integer);

        // get() to get the value from optional

        System.out.println("Value from get():: "+oInteger.get());

        // isPresent() before get()

        Optional<Integer> emptyInt = Optional.empty();
        Integer nonEmptyInt = emptyInt.isPresent()?  emptyInt.get() : 0;
        System.out.println("value from get() safely:: "+nonEmptyInt);

        // orElse

        nonEmptyInt = emptyInt.orElse(0);
        System.out.println("getting value safely from orElse():: "+nonEmptyInt);
        System.out.println("getting value safely from orElse():: "+oInteger.orElse(0));

        // orElseGet() - this takes supplier

        nonEmptyInt = emptyInt.orElseGet(()-> 0);
        System.out.println("getting value safely from orElseGet():: "+nonEmptyInt);
        System.out.println("getting value safely from orElseGet():: "+oInteger.orElseGet(()-> 0));

        //orElseThrow()
        System.out.println("getting value safely from orElseThrow():: "+oInteger.orElseThrow(IllegalArgumentException::new));
        nonEmptyInt = emptyInt.orElseThrow(IllegalArgumentException::new);
        emptyInt.orElseThrow(); // this will throw NoSuchElementException() - this was introduced in java 11
        System.out.println("getting value safely from orElseThrow():: "+nonEmptyInt);

    }
}
