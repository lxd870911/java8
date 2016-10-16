package com.wangwenjun.java8.chapter2;

import com.wangwenjun.java8.common.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by wangwenjun on 2016/5/25.
 */
public class FilterApple {

    public static void main(String[] args) {

        List<Apple> appleList = Arrays.asList(new Apple("red", 100), new Apple("green", 150));

        BiFunction<List<Apple>, ApplePredicate, List<Apple>> filterAppleFunction =
                FilterApple::filterApple;

        List<Apple> result = filterAppleFunction.apply(appleList, (apple) -> apple.getColor().equals("red"));

        System.out.println(result);

        System.out.println(filterAppleWithPredicate(appleList, (apple) -> apple.getColor().equals("red")));

        Consumer<String> c1=FilterApple::test1;
        c1.accept("xxxxxxxxxxxxx");


        Runnable runnable = FilterApple::test1;

        runnable.run();

        Consumer<FilterApple> test2 = FilterApple::test2;


        Function<FilterApple,String> filterAppleStringStringBiFunction = FilterApple::test3;

        Function<FilterApple,String> filterAppleStringStringBiFunction2=(filter)->filter.test3();

        filterAppleStringStringBiFunction.apply(null);
    }

    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate) {
        return inventory.stream().filter(a -> predicate.filter(a)).collect(Collectors.toList());
    }

    public static List<Apple> filterAppleWithPredicate(List<Apple> inventory, Predicate<Apple> predicate) {
        return inventory.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void test1(String s)
    {

    }

    public static void test1()
    {

    }

    public void test2()
    {

    }

    public String test3()
    {
        return "";
    }

    public String test3(String s)
    {
        return "";
    }
}
