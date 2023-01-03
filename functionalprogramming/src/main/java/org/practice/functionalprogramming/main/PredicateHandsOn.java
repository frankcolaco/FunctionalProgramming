package org.practice.functionalprogramming.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateHandsOn {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("functional");
        list.add("");
        list.add("Programming");
        list.add("");
        Predicate<String> validateForEmptyValues = s -> !s.isEmpty();
        Predicate<Integer> evenInts = integer -> integer % 2 ==0;
        List<Integer> integers = List.of(1,2,6,4,3,8,9,5);
        System.out.println("List with non empty values with static method:: "+ filterList(list,validateForEmptyValues));
        System.out.println("List with non empty values:: "+ list.stream().filter(validateForEmptyValues).collect(Collectors.toList()));

        List<Integer> evens = filterList(integers,evenInts);
        System.out.println(evens);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> filterCriteria) {
        return list.stream().filter(filterCriteria).collect(Collectors.toList());
    }
}
