package com.aniamadej;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setCurrentStrategy(new DividingCountingStrategy());

        CountingStrategy str1 = new AddingCountingStrategy();
        CountingStrategy str2 = new SubtractingCountingStrategy();
        CountingStrategy str3 = new MultiplicatingCountingStrategy();
        CountingStrategy str4 = new DividingCountingStrategy();

        List<CountingStrategy> strategies = new ArrayList<>();
        strategies.add(str1);
        strategies.add(str2);
        strategies.add(str3);
        strategies.add(str4);

        strategies.forEach(str -> {
            calculator.setCurrentStrategy(str);
            try {
                System.out.println(calculator.count(2., 5.));
            } catch (IllegalArgumentException e) {
                System.out.println("Illegl argument!");
            }
        });

        calculator.setCurrentStrategy(str4);
        try {
            System.out.println(calculator.count(2., 0.));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegl argument! :)");
        }


    }
}
