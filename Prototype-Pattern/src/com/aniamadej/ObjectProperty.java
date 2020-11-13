package com.aniamadej;

public class ObjectProperty implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public ObjectProperty(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectProperty clone(){
        try {
            return (ObjectProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
