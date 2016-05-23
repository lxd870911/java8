package com.wangwenjun.java8.chapter1;

import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by wangwenjun on 2016/5/23.
 */
public class NewFutures {
    public static void main(String[] args) {
        Supplier<ArrayList<String>> supplier = ArrayList::new;
        Function<String, Integer> stringIntegerFunction = String::length;
        Integer length = stringIntegerFunction.apply("wangwenjun");
        System.out.println(length);

        BiFunction<List, String, Boolean> listEBooleanBiFunction1 = List<String>::add;
        ArrayList<String> strings = supplier.get();
        listEBooleanBiFunction1.apply(strings, "alex");
        System.out.println(strings.get(0));


        BiFunction<NewFutures, Object, Boolean> isValid = NewFutures::isValid;


    }

    private void testPredicate()
    {
        Predicate<Object> p= this::isValid;
    }

    private boolean isValid(Object obj){
        return true;
    }
}
