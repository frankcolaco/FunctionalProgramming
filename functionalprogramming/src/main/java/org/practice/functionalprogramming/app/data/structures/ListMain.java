package org.practice.functionalprogramming.app.data.structures;

import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        FunctionalList<Integer> list = FunctionalList.ofList(3,6,8,5,2);
        list.forEach(System.out::println);

        System.out.println();
        FunctionalList<Integer> newList = list.addElement(56);
        newList.forEach(System.out::println);

        System.out.println();
        FunctionalList<Integer> nwList = newList.removeElement(6);
        nwList.forEach(System.out::println);

        System.out.println();
        nwList.reverseList().forEach(System.out::println);

        System.out.println();
        FunctionalList.concat(nwList,list).forEach(System.out::println);

        System.out.println();
        FunctionalList<Integer> lists = FunctionalList.ofList(2,5,4,12,7,9);
        lists.addAllElements(List.of(9,4,4,5,5,7)).forEach(System.out::println);

    }
}
