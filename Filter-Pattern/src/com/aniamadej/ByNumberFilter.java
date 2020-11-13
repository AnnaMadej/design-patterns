package com.aniamadej;

import java.util.function.Predicate;

public class ByNumberFilter implements Predicate<ToFilter> {

    private int number;

    public ByNumberFilter(int number) {
        this.number = number;
    }

    @Override
    public boolean test(ToFilter toFilter) {
        return this.number == toFilter.getNumber();
    }
}
