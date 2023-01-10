package org.practice.functionalprogramming.app.design.patterns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StrategyDesignPatternMain {

    public static void main(String[] args) {

        List<Stock> stockList = List.of(new Stock("TAMO",480.5,20.0),
                new Stock("TAPO",230.5,21.0),
                new Stock("HDFCBK",1875.4,100.0),
                new Stock("ICICIBK",780.5,105.0));

        // conventional way to filter data
        Filter.byPriceAbove(stockList,235.5).forEach(System.out::println);
        Filter.bySymbol(stockList,"TAMO").forEach(System.out::println);


        // using the java 8 way with Lambda's
        Filter.filter(stockList,stock -> stock.getUnit()>75).forEach(System.out::println);


    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class Stock{

    private String scriptName;
    private Double price;
    private Double unit;
}

class Filter{
    // this is a conventional way of implementing strategy design pattern where we will implement respective method to filter the data
    public static List<Stock> bySymbol(List<Stock> list,String symbol){

        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock: list) {
            if(stock.getScriptName().equalsIgnoreCase(symbol))
                filteredData.add(stock);
        }
        return filteredData;
    }

    public static List<Stock> byPriceAbove(List<Stock> list,Double price){

        List<Stock> filteredData = new ArrayList<>();
        for (Stock stock: list) {
            if(stock.getPrice()>price)
                filteredData.add(stock);
        }
        return filteredData;
    }

    // in order to utilize lambda's we can use a common filter method which will take the list and predicate to filter data on the fly

    public static List<Stock> filter(List<Stock>list, Predicate<Stock> p){
        return list.stream().filter(p).collect(Collectors.toList());
    }
}
