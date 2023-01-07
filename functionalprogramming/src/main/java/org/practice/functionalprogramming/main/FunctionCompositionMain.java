package org.practice.functionalprogramming.main;

import lombok.Getter;
import lombok.Setter;

public class FunctionCompositionMain {

    public static void main(String[] args) {

        Square square = new Square(100);

        Function<Square, Integer> areaFn = Square::getArea;
        Function<Integer,Double> sideFn = Math::sqrt;
        Function<Square,Double> getSide = sideFn.compose(areaFn);

        System.out.println(getSide.apply(square));




    }
}

@Getter
@Setter
class Square{
    int area;

    Square(int area){
        this.area=area;
    }
}

interface Function<T,R>{

    R apply(T t);

    default <V> Function<V,R>compose(Function<V,T> before){

        // here we will call the calling method after caller method
        return (V v)->apply(before.apply(v));

    }

}
