package org.practice.functionalprogramming.app.functional.key.concepts;

public class ClosuresMain {

    public static void main(String[] args) {

        int val = 112;

        // function that refers free variable val
        Task lambda = ()->{
            System.out.println(val);
            System.out.println("Task completed");
        };

        printValue(lambda);

    }

    private static void printValue(Task lambda) {

        lambda.doTask();
    }
}

@FunctionalInterface
interface Task{

    void doTask();

}
