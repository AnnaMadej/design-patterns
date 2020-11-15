package com.aniamadej;

public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        this.getObservers().forEach(o -> o.update(state));
    }
}
