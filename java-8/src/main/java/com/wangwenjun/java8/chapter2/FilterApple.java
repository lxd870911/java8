package com.wangwenjun.java8.chapter2;

import com.wangwenjun.java8.common.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by wangwenjun on 2016/5/25.
 */
public class FilterApple {

    public static void main(String[] args) {

        List<Apple> appleList = Arrays.asList(new Apple("red", 100), new Apple("green", 150));

        BiFunction<List<Apple>, ApplePredicate, List<Apple>> filterAppleFunction =
                FilterApple::filterApple;

        Supplier<List<Apple>> supplier = ArrayList::new;

        List<Apple> result = filterAppleFunction.apply(appleList, (apple) -> apple.getColor().equals("red"));

        System.out.println(result);

        System.out.println(filterAppleWithPredicate(appleList, (apple) -> apple.getColor().equals("red")));
    }

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.filter(apple))
                result.add(apple);
        }

        return result;
    }

    public static List<Apple> filterAppleWithPredicate(List<Apple> inventory, Predicate<Apple> predicate) {
        return inventory.stream().filter(predicate).collect(Collectors.toList());
    }
}
