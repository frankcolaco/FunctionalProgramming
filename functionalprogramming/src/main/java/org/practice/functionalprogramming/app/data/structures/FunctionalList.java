package org.practice.functionalprogramming.app.data.structures;

import java.util.Collection;
import java.util.function.Consumer;

public abstract class FunctionalList<T> {

    public abstract T head();

    public abstract FunctionalList<T> tail();

    public abstract boolean isEmpty();

    public static final FunctionalList NIL = new Nil();

    private static class Nil<T> extends FunctionalList<T>{

        private Nil(){}


        @Override
        public T head() {
            return null;
        }

        @Override
        public FunctionalList<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    public int length(){
        int l = 0;
        FunctionalList<T> temp = this;
        while(!temp.equals(NIL)){
            l++;
            temp = temp.tail();
        }
        return l;
    }
    private static class FunctionalListImpl<T> extends FunctionalList<T> {

        private final T head;

        private final FunctionalList<T> tail;

        FunctionalListImpl(T element, FunctionalList<T> list) {
            this.head = element;
            this.tail = list;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public FunctionalList<T> tail() {
            return tail;
        }

        @Override
        public boolean isEmpty() {
            return length() == 0;
        }
    }

        public static <T> FunctionalList<T> list(){
            return NIL;
        }

        @SafeVarargs
        public static <T> FunctionalList<T> ofList(T...t){
            FunctionalList<T> temp = list();
            for(int i=t.length-1;i>=0;i--){
                temp = new FunctionalListImpl<>(t[i],temp);
            }
            return temp;
        }

        public FunctionalList<T> addElement(T t){
            return new FunctionalListImpl<T>(t,this);
        }

        public FunctionalList<T> addElement(int pos,T t){
            if(pos<1 || pos >length())
                throw new IndexOutOfBoundsException();
            if(pos ==1)
                return this.tail().addElement(t);

            return new FunctionalListImpl<T>(head(),tail().addElement(pos-1,t));
        }

        public void forEach(Consumer<? super T> action) {

            T current = this.head();
            FunctionalList<T> temp = this;

            for (int i = 0; i < length(); i++) {
                action.accept(current);
                temp = temp.tail();
                current = temp.head();
            }
        }

        public FunctionalList<T> removeElement(T element){
                if(this.length() ==0)
                    return this;
                else if(element.equals(this.head()))
                    return tail();
                else{
                    FunctionalList<T> newTailList = tail().removeElement(element);
                    return new FunctionalListImpl<T>(head(),newTailList);
                }
            }

        public FunctionalList<T> removeElement(int pos,T element){
            if(pos<1 || pos >length())
                throw new IndexOutOfBoundsException();
            if(pos ==1)
                return this.tail().addElement(element);

            return new FunctionalListImpl<T>(head(),tail().removeElement(pos-1,element));
        }

        public FunctionalList<T> reverseList(){
            FunctionalList<T> list =list();

            T current = this.head();
            FunctionalList<T> temp = this;
            while (!temp.equals(NIL)){
                list = list.addElement(current);
                temp = temp.tail();
                current= temp.head();
            }
            return list;
        }

        public static <T> FunctionalList<T> concat(FunctionalList<T>list1,FunctionalList<T>list2){
            return list1.isEmpty()? list2: new FunctionalListImpl<T>(list1.head(),concat(list1.tail(),list2));
        }

        public FunctionalList<T> addAllElements(final Collection<? extends T> list){

            FunctionalList<T> result = this;
            for (T t: list){
                result = result.addElement(t);
            }
            return result;
        }
}
