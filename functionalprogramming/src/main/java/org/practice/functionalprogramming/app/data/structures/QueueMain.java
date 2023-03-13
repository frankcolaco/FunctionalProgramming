package org.practice.functionalprogramming.app.data.structures;

public class QueueMain {

    public static void main(String[] args) {

        FunctionalQueue<String> queue =  FunctionalQueue.queue();

        FunctionalQueue<String> enqueue = queue.enqueue("Hey").enqueue(" , How's it going");

        enqueue.forEach(System.out::println);

        FunctionalQueue<String> dequeue = enqueue.dequeue();

        dequeue.forEach(System.out::println);

        System.out.println(enqueue.peek());

    }
}
