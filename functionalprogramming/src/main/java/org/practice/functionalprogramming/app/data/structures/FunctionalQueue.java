package org.practice.functionalprogramming.app.data.structures;

import java.util.function.Consumer;

public class FunctionalQueue<T> {

    private final FunctionalList<T> front;
    private final FunctionalList<T> rear;

    public FunctionalQueue() {
        this.front = FunctionalList.list();
        this.rear = FunctionalList.list();
    }

    public static <T> FunctionalQueue<T> queue(){
        return new FunctionalQueue<>();
    }

    private FunctionalQueue(FunctionalQueue<T> queue,T element){
        boolean isFrontEmpty = queue.front.isEmpty();
        this.front = isFrontEmpty? queue.front.addElement(element): queue.front;
        this.rear = isFrontEmpty?queue.rear:queue.rear.addElement(element);
    }

    public FunctionalQueue<T> enqueue(T t){
        return  new FunctionalQueue<>(this,t);
    }

    private FunctionalQueue(FunctionalList<T>front,FunctionalList<T> rear){
        final boolean isFrontEmpty = front.isEmpty();
        this.front = isFrontEmpty? rear.reverseList() : front;
        this.rear = isFrontEmpty? front:rear;
    }

    public FunctionalQueue<T> dequeue(){
        return new FunctionalQueue<>(this.front.tail(),rear);
    }

    void forEach(Consumer<T> action) {
        T current = front.head();
        FunctionalList<T> temp = FunctionalList.concat(this.front.tail(), this.rear.reverseList());
        while (temp != null) {
            action.accept(current);
            current = temp.head();
            temp = temp.tail();
        }
    }

    public int size(){
          return  front.length() + rear.length();
        }

    public T peek(){
        if(this.size()==0){
            return null;
        }
        return this.front.head();
    }

    public boolean isEmpty(){
        return this.front.isEmpty() == this.rear.isEmpty();
    }
}
