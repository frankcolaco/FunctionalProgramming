package org.practice.functionalprogramming.functioninterfaces;

@FunctionalInterface
public interface FunctionalGenerics<T,R> {

    R execute(T t);
}
