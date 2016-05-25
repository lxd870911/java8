package com.wangwenjun.java8.common;

/**
 * Created by wangwenjun on 2016/5/25.
 */
public class Apple {

    private final String color;

    private final int weight;

    public Apple(final String color, final int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
