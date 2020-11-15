package com.aniamadej;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcreteObserver2 extends Observer {
    private List<Character> chars;
    
    @Override
    public void update(String state) {
        chars = state.codePoints().mapToObj(c-> (char) c).collect(Collectors.toList());
    }

    public List<Character> getChars() {
        return chars;
    }
}
