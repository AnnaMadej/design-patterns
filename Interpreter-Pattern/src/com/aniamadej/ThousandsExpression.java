package com.aniamadej;

public class ThousandsExpression extends Expression {
    @Override
    protected String one() {
        return "M";
    }

    @Override
    protected String four() {
        return " ";
    }

    @Override
    protected String five() {
        return " ";
    }

    @Override
    protected String nine() {
        return " ";
    }

    @Override
    protected int multiplier() {
        return 1000;
    }
}
