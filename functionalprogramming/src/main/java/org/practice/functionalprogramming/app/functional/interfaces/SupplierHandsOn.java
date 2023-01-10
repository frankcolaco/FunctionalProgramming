package org.practice.functionalprogramming.app.functional.interfaces;

import java.util.function.Supplier;

public class SupplierHandsOn {

    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> new String("New String");

        System.out.println(stringSupplier.get());
    }
}
