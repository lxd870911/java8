package com.wangwenjun.java8.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo
{

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Wangwenjun","Andy");
        Spliterator<String> spliterator = names.spliterator();
//        System.out.println(spliterator.characteristics());
//        System.out.println(spliterator.estimateSize());
//        System.out.println(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(System.out::println);
//        Spliterator<String> stringSpliterator = spliterator.trySplit();
        //stringSpliterator.tryAdvance(System.out::println);
//        stringSpliterator.forEachRemaining(System.out::println);
    }
}
