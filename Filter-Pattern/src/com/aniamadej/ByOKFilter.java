package com.aniamadej;

import java.util.function.Predicate;

public class ByOKFilter implements Predicate<ToFilter> {


    @Override
    public boolean test(ToFilter toFilter) {
        return toFilter.isOK();
    }
}
