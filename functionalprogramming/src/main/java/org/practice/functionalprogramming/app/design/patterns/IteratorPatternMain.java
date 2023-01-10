package org.practice.functionalprogramming.app.design.patterns;

import java.util.function.Consumer;

public class IteratorPatternMain {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(new Object[]{2, 5, 7, 1, 6});

        list.forEach(System.out::println);

    }
}

class MyArrayList {

    Object[] elements = new Object[5];

    public MyArrayList(Object[] elements){
        this.elements=elements;
    }

    public void forEach(Consumer<Object> action){

        for (Object element : elements) {
            action.accept(element);
        }

    }

}
