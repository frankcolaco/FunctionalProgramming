package org.practice.functionalprogramming.app;

import java.util.function.Function;

public class ConstructorReference {

    public static void main(String[] args) {
        Function<Runnable,Thread> threadGenerator = Thread::new;//r -> new Thread(r);

        Runnable task1 = ()-> System.out.println("Task1 completed");

        Runnable task2 = ()-> System.out.println("Task2 completed");

        Thread t1 = threadGenerator.apply(task1);
        Thread t2 = threadGenerator.apply(task2);

        t1.start();
        t2.start();

        threadGenerator.apply(()-> System.out.println("Task3 completed")).start();
    }
}
