package org.practice.functionalprogramming.main;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerHandsOn {

    public static void main(String[] args) {
        List<Integer> integers =  List.of(34,66,55,22,88,6,4,1,3,2);

        Consumer<Integer> consumer = System.out::println;

        printElements(integers,consumer);

    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {

        for(T l: list){

            consumer.accept(l);

        }
    }
}
