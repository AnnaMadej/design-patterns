package com.aniamadej;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public Memento getMemento(int index){
        return mementos.get(index);
    }

    public Memento getLastMemento(){
        return mementos.get(mementos.size()-1);
    }

    public void addMemento(Memento memento){
        this.mementos.add(memento);
    }

    public void removeMemento(Memento memento){
        this.mementos.remove(memento);
    }

    public void removeMemento(int index){
        this.removeMemento(mementos.get(index));
    }

    public List<Memento> getMementos() {
        return new ArrayList<>(mementos);
    }
}
