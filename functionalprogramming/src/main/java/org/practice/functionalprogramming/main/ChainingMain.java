package org.practice.functionalprogramming.main;

import java.util.Objects;

public class ChainingMain {

    public static void main(String[] args) {

        Consumer<String> consumer = s ->System.out.println("I am Frank");
        Consumer<String> consumer1 = System.out::println;

        //consumer.accept("Hello");
        //consumer1.accept("functionalProgramming");
        Consumer<String> c4 = consumer1.thenAccept(consumer);
        c4.accept("Hello, ");
    }
}

@FunctionalInterface
interface Consumer<T>{

    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T>s){
        Objects.requireNonNull(s);
        return (T t)->{
            // here we will call accept on calling function first and then the caller function
            this.accept(t);
            s.accept(t);
        };
    }
}
