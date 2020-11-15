package com.aniamadej;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public abstract void notifyObservers();

}
