package com.aniamadej;

public class Client {
    private Int1 int1Obj;

    public Client(Int1 int1Obj) {
        this.int1Obj = int1Obj;
    }

    public void callObj(){
        int1Obj.doSomething();
    }
}
