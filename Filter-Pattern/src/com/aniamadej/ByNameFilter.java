package com.aniamadej;

import java.util.function.Predicate;

public class ByNameFilter implements Predicate<ToFilter> {

    private String name;

    public ByNameFilter(String name) {
        this.name = name;
    }

    @Override
    public boolean test(ToFilter toFilter) {
        return toFilter.getName().contains(this.name);
    }
}
