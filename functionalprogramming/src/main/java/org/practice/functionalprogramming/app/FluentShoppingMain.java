package org.practice.functionalprogramming.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FluentShoppingMain {

    public static void main(String[] args) {

        Order.placeOrder(order -> order.add("Shoes").deliverAt("Vasai"));

    }
}

class Order{

    private String location;
    private List<String> cart = new ArrayList<>();

    public Order(String location, List<String> cart) {
        this.location = location;
        this.cart = cart;
    }

    public Order() {
    }

    public Order add(String item){
        cart.add(item);
        System.out.println(item +" added to the cart");
        return new Order(this.location,this.cart);
    }

    public Order deliverAt(String location){
        this.location=location;
        System.out.println("The delivery address:: "+location);
        return new Order(this.location,this.cart);
    }

    public static void placeOrder(Function<Order,Order> function){
        Order order = new Order();
        order= function.apply(order);
        System.out.println("Order is placed");
        System.out.println(order.cart.size()+" item(s) ordered and will be delivered by tomorrow at "+order.location);
    }
}
