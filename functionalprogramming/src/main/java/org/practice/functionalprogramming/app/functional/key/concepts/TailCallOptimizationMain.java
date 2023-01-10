package org.practice.functionalprogramming.app.functional.key.concepts;

public class TailCallOptimizationMain {

    public static void main(String[] args) {

    }

    private static long reFact(int n){
        if(n <=1)
            return 1;
        else
            return n *reFact(n-1);
    }

    private static long tailFact(int n,int a){

        if(n<=1)
            return a;
        else
            return tailFact(n-1,n*a);

    }
}
