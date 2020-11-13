package com.aniamadej;

public class Main {

    public static void main(String[] args) {
	Component someclass = new SomeClass();

	Component hashes = new AddingHashesDecorator(someclass);
	Component stars = new AddingStarsDecorator(hashes);
	Component lines = new AddingLinesDecorator(stars);

	lines.doSomething();
    }
}
