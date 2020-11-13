package com.aniamadej;

public class Int2Int1ClassAdapter extends ClassOfInt2 implements Int1 {


    @Override
    public void doSomething() {
       this.doSomethingElse();
    }

}
