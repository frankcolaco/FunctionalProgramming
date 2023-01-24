package org.practice.functionalprogramming.app.collector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectorMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3,2,1,6,5,4,7,8,9,3,4,2,1);

        Collector<Integer,List<Integer>,List<Integer>> toList = Collector.of(ArrayList::new,//supplier
                List::add,//accumulator -> BiConsumer
                (list1,list2)-> {// combiner -> BiFunction
            list1.addAll(list2);
            return list1;
        },Collector.Characteristics.IDENTITY_FINISH);// characteristics

        List<Integer> evenIntegers = numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(toList);

        System.out.println(evenIntegers);

        Collector<Integer,List<Integer>,List<Integer>> toSortedList = Collector.of(ArrayList::new,//supplier
                List::add,//accumulator -> BiConsumer
                (list1,list2)-> {// combiner -> BiFunction
                    list1.addAll(list2);
                    return list1;
                },
                (list)-> {// finisher -> is a function
                    Collections.sort(list);
                    return list;
                },Collector.Characteristics.UNORDERED);

        List<Integer> sortedIntegers = numbers.stream().collect(toSortedList);
        System.out.println(sortedIntegers);

    }
}
