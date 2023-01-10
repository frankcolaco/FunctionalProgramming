package org.practice.functionalprogramming.app.design.patterns;

import lombok.ToString;

import java.util.function.Function;

public class DecoratorDesignPatternMain {
    public static void main(String[] args) {

        Burger myOrder = new BurgerShop(Burger::addCheese).use(new BurgerShop(Burger::addChicken).use(new Burger()));
        System.out.println("I ordered: "+myOrder);

    }
}

class Burger{
    String type = "";

    public Burger(){
        this.type="";
    }

    private Burger(String type){
        this.type=type;
    }

    public Burger addChicken(){
        System.out.println("Adding Chicken");
        return new Burger(this.type += "Chicken");
    }

    public Burger addCheese(){
        System.out.println("Adding Cheese");
        return new Burger(this.type += "Cheese");
    }

    public String toString() {
        return String.format("%s", type + " burger");
    }

}

class BurgerShop{
    Function<Burger,Burger> decoration;

    BurgerShop(Function<Burger,Burger> decoration){
        this.decoration=decoration;
    }

    public Burger use(Burger baseBurger){
        System.out.println("BaseBurger: "+baseBurger);
        return decoration.apply(baseBurger);
    }
}
