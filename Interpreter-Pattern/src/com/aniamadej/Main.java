package com.aniamadej;

import java.util.LinkedList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        String input = "MMMCMXCVIII";
        Context context = new Context(input);

        List<Expression> expressionsTree  = new LinkedList<>();
        expressionsTree.add(new ThousandsExpression());
        expressionsTree.add(new HundredsExpression());
        expressionsTree.add(new DozensExpression());
        expressionsTree.add(new UnitsExpression());

        expressionsTree.forEach(e -> e.interpret(context));

        System.out.println("MMMCMXCVIII is: " + context.getOutput());
    }
}
